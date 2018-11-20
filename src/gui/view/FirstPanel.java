package gui.view;


import javax.swing.*; 									// JPanel shortcut
import gui.controller.GUIController;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstPanel extends JPanel 					// Must have
{
	
	private GUIController appController;
	private JButton myButton;
	private JLabel myLabel;
	private SpringLayout appLayout;
	
	public FirstPanel(GUIController appController)
	{
		super();         								// Must have
		this.appController = appController; 			// Must have
		
		myButton = new JButton("Click!");
		myLabel = new JLabel("[Insert Text]");
		
		myLabel.setHorizontalAlignment(SwingConstants.CENTER);
		appLayout = new SpringLayout();
		appLayout.putConstraint(SpringLayout.NORTH, myLabel, 10, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, myLabel, -653, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, myButton, 147, SpringLayout.SOUTH, myLabel);
		appLayout.putConstraint(SpringLayout.WEST, myButton, 348, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.WEST, myLabel, 184, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, myLabel, -201, SpringLayout.EAST, this);
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.add(myButton);
		this.add(myLabel);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void changeColor()
	{
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		
		this.setBackground(new Color(red, green, blue));
	}
	
	private void setupListeners()
	{
		myButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent mouseClick)
			{
				changeColor();
			}
		});
	}
	
}
