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
		this.setContentPane(appPanel);	// Installs the custom window known as appPanel
		this.setSize(800, 800);			// Dimensions of the popup (int width, int height)
		this.setTitle("My GUI");		// Title of the popup that displays at the top
		this.setResizable(true);		// Determines whether the popup can resize to the user's computer screen
		this.setVisible(true);			// Lets the window be viewable when the program is ran
		// The LAST line of the setupFrame method must be 'setVisible(true)'. You can set it's visibility until you've set everything else (i.e. size, title, etc.)
	}
}
