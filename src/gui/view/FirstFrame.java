package gui.view;

import javax.swing.JFrame;
import gui.controller.GUIController;

public class FirstFrame extends JFrame
{

	private GUIController appController;
	private FirstPanel appPanel;
	
	public FirstFrame(GUIController appController)
	{
		// If a class uses the 'extends' keyword, the FIRST line in the class constructor must be 'super();'
		super();
		this.appController = appController;
		this.appPanel = new FirstPanel(appController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setSize(800, 800);
		this.setTitle("My GUI");
		this.setResizable(true);
		this.setVisible(true);
		// The LAST line of the setupFrame method must be 'setVisible(true)'. You can set it's visibility until you've set everything else (i.e. size, title, etc.)
	}
	
	
}
