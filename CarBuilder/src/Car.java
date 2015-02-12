import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
public abstract class Car 
{
	protected static String make; 
	protected static String model; 
	protected static String wheels; 
	protected static String engine;
	protected static int XP = 0; 
	protected static String isFaster; 
	protected static String toCar; 
	
	public void whatType() 
		{
		
		}
	public void makePerformance() 
		{
		
		}
	public void whatMake() 
		{
		System.out.println("This car has a make.");
		}
	public void whatModel() 
		{
		System.out.println("This car has a model");
		}
	public void whatEngine() 
		{
		System.out.println("This car has an engine.");
		}
	public void whatWheels() 
		{
		System.out.println("This car has wheels.");
		}
}