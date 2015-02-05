import java.util.Scanner; 
public class Performance extends Car
{
	
	public static void makePerformance() 
		{
		System.out.println("You have chosen to make a performance car.");
		System.out.println("Are you ready to begin. Yes or No");
		Scanner scanner = new Scanner(System.in); 
		String answer = scanner.next(); 
		if(answer.equalsIgnoreCase("yes")) 
			{
			beginBuild(); 
			}
		else 
			{
			CarRunner.whatType();
			}
		}
	public static void beginBuild() 
		{
		System.out.println("What type of make do you want to start with");
		System.out.println("BMW, Audi, Lamborghini, Ferrari");
		Scanner scanner = new Scanner(System.in); 
		String input = scanner.next();
		make = input; 
		switch(input) 
			{
			case("BMW"):
			case("bmw"):
			case("bMW"):
			case("BmW"):
			case("BMw"):
			case("bmW"):
			case("beamer"):
				{
				bmwBuild(); 
				break; 
				}
			case("Audi"):
			case("audi"):
				{
				audiBuild(); 
				break; 
				}
			case("Lamborghini"):
			case("lamborghini"):
				{
				lamboBuild(); 
				break; 
				}
			case("Ferrari"):
			case("ferrari"):
				{
				ferrariBuild(); 
				break; 
				}
			}
		}
	public static void bmwBuild() 
		{
		Scanner scanner = new Scanner(System.in); 
		String Bmodel = scanner.next(); 
		System.out.println("M235i");
		System.out.println("M3");
		System.out.println("M4");
		System.out.println("M5");
		System.out.println("M6");
		System.out.println("M3 CSL");
		System.out.println("M4 DTM");
		System.out.println("Z3M");
		}
	public static void audiBuild() 
		{
		System.out.println("S3");
		System.out.println("S4");
		System.out.println("S5");
		System.out.println("RS5");
		System.out.println("S6");
		System.out.println("R8");
		}
	public static void lamboBuild() 
		{
		System.out.println("Huracan");
		System.out.println("Aventador");
		System.out.println("Veneno");
		}
	public static void ferrariBuild() 
		{
		System.out.println("458");
		System.out.println("F12");
		System.out.println("La Ferrari");
		System.out.println("599 GTO");
		}
}
