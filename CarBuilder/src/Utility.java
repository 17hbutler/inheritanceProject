
public class Utility extends Car
{
	public Utility() 
		{
		make = "Ford"; 
		model = "F-150"; 
		year = 2014;
		wheels = "Goodyear"; 
		engine = "8 cylinder";
		
		myTurbo = (isTurbo) new doesNotGoFaster(); 
		}
	public static void makeUtility() 
		{
		System.out.println("You have chose to make a utility car");
		}
}
