package gui.view;

import javax.swing.JPanel;
import gui.controller.GUIController;

public class FirstPanel extends JPanel 					// Must have
{
	
	private GUIController appController;
	
	public FirstPanel(GUIController appController)
	{
		super();         								// Must have
		this.appController = appController; 			// Must have
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
	
}
