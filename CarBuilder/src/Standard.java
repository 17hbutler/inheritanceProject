
public class Standard extends Car 
{
	public Standard() 
		{
		make = "Ford"; 
		model = "Fiesta"; 
		year = 2014;
		wheels = "Goodyear"; 
		engine = "3 cylinder";
		
		myTurbo = (isTurbo) new doesNotGoFaster(); 
		}
}
