package robot.model;
import lejos.hardware.ev3.LocalEV;
//import lejos.hardware
//import lejos.hardware
//import lejos.hardware
//import lejos.robotics
//import lejos.robotics
//import lejos.robotics
//import lejos.utility
import lejos.hardware.*;
//import lejos.hardware

public class EV3Bot 
{
	
	private void setupPilot()
	{
		Wheel leftWheel = WeeledChassis.modelWheel(Motor.A, 55.0).offset(-72);
		Wheel rightWheel =  WheeledChassis.moderlWheel(Motor.B,55.0).offset(-72);
		WheeledChassis chassis = new WheeledChassis(new Wheel[] { leftWheel, rightWheel}, WheeledChassis.TYPE_DIFFERENTIAL);
		botPilot = new MovePilot(chassis);
	}
	
	public void driveRoom()
	{
		ultrasonicSamples = new float [distanceSensor.sampleSize()];
		distanceSensor.fetchSample(ultrasonicSamples, 0);
		if(ultrasonicSample[0] < 2.5)
		{
			displayMessage("I amat the door!");
			driveShort();
		}
		
		else
		{
			displayMessage("Long drive");
			driveLong();
		}
		displayMessage("I am at the door!");
	}
	
	public void displayMessage()
	{
		LCD.drawString(botMessage, xPosition,yPosition);
		Delay.mselay(waitTime);
	}
	
	public void displayMessage(String message)
	{
		
	}
	
	public void rotate()
	{
		
	}
	
	public void travel()
	{
		
	}
	
}
