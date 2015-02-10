import java.util.Scanner; 
public class Performance extends Car
{
	@Override
	public void whatType() 
		{
		System.out.println("What type of car do you want to build. Performance, Utility, Standard.");
		Scanner scanner = new Scanner(System.in); 
		String answer = scanner.next(); 
	
		if(answer.equalsIgnoreCase("Performance")) 
			{
			makePerformance();
			}
		}
	@Override
	public void makePerformance() 
		{
		System.out.println("You have chosen to make a performance car.");
		System.out.println("Are you ready to begin. Yes or No");
		Scanner scanner = new Scanner(System.in); 
		String answer = scanner.next(); 
		if(answer.equalsIgnoreCase("yes")) 
			{
			whatMake(); 
			}
		else 
			{
			whatType();
			}
	}
	@Override
	public void whatMake() 
		{
		System.out.println("What type of make do you want to start with");
		System.out.println("BMW, Audi, Lamborghini, Ferrari");
		Scanner scanner = new Scanner(System.in); 
		String input = scanner.next();
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
				make = input; 
				bmwBuild(); 
				break; 
				}
			case("Audi"):
			case("audi"):
				{
				make = input; 
				audiBuild(); 
				break; 
				}
			case("Lamborghini"):
			case("lamborghini"):
			case("lambo"):
				{
				make = input; 
				lamboBuild(); 
				break; 
				}
			case("Ferrari"):
			case("ferrari"):
				{
				make = input; 
				ferrariBuild(); 
				break; 
				}
			}
		}
	public static void bmwBuild() 
		{
		Scanner scanner = new Scanner(System.in); 
		System.out.println("M235i");
		System.out.println("M3");
		System.out.println("M4");
		System.out.println("M5");
		System.out.println("M6");
		System.out.println("M3 CSL");
		System.out.println("M4 DTM");
		System.out.println("Z3M");
		String Bmodel = scanner.next(); 
		model = Bmodel;
		}
	public static void audiBuild() 
		{
		Scanner scanner = new Scanner(System.in);  
		System.out.println("S3");
		System.out.println("S4");
		System.out.println("S5");
		System.out.println("RS5");
		System.out.println("S6");
		System.out.println("R8");
		String Amodel = scanner.next();
		model = Amodel; 
		}
	public static void lamboBuild() 
		{
		Scanner scanner = new Scanner(System.in);  
		System.out.println("Huracan");
		System.out.println("Aventador");
		System.out.println("Veneno");
		String Lmodel = scanner.next();
		model = Lmodel; 
		}
	public static void ferrariBuild() 
		{
		Scanner scanner = new Scanner(System.in); 
		System.out.println("458");
		System.out.println("F12");
		System.out.println("La Ferrari");
		System.out.println("599 GTO");
		String Fmodel = scanner.next(); 
		model = Fmodel; 
		}
	
	@Override
	public void whatEngine() 
		{
		System.out.println("The car you have chosen is an " + make + " " + model);
		System.out.println("Now it is time to pick the engine to put into your car.");
		System.out.println("Here are your choices.");
		Scanner scanner = new Scanner(System.in); 
		if(make.equals("BMW") || make.equals("Audi")) 
			{
			System.out.println("V8");
			System.out.println("Strait Six");
			System.out.println("V6");
			System.out.println("Inline 4");
			System.out.println("Boxer");
			String myEngineBA = scanner.next();
			engine = myEngineBA; 
			}
		else if(make.equals("Lamborghini") || make.equals("Ferrari")) 
			{
			System.out.println("V12");
			System.out.println("V10");
			System.out.println("V8");
			String myEngineLF = scanner.next(); 
			engine = myEngineLF; 
			}
		}

	}
