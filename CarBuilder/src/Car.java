import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
public abstract class Car 
{
	protected String make; 
	protected String model; 
	protected int year; 
	protected String wheels; 
	protected String engine;
	protected isTurbo myTurbo; 
	
	public void car() 
		{
		System.out.println("This cars make is " + make + ". This cars model is " + model + ". The year it was made is " + year + ". ");
		}
	public void components() 
		{
		System.out.println("This car has " + wheels + " and a " + engine + ". ");
		}
	
}
