package gui.controller;

import gui.model.Duck;
import gui.view.FirstFrame;

public class GUIController 
{
	private Duck myDuck;
	private FirstFrame appFrame;
	
	public GUIController()
	{
		// Always instantiate your gui AFTER you've instantiated your model!
		myDuck = new Duck(); // Model
		appFrame = new FirstFrame(this); // GUI
		// To build a reference and send it, you pass 'this' as a parameter
	}
	
	public void Start()
	{
		
	}
}