import java.util.Scanner; 
public class Performance extends Car
{
	@Override
	public void whatType() 
		{
		try 
			{
			System.out.println("What type of car do you want to build. Performance, Utility, Standard.");
			Scanner scanner = new Scanner(System.in); 
			String answer = scanner.next(); 
			if(answer.equalsIgnoreCase("Performance")) 
				{
				makePerformance();
				}
			}
		catch(java.lang.NullPointerException exc) 
			{
			System.out.println("Opps...Check your spelling.");
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
	public static void turbo() 
		{
		System.out.println("Do you want your engine turbo charged or super charged.");
		System.out.println("Turbo Charged input 1.");
		System.out.println("Super Charged input 2.");
		System.out.println("Neither input 0.");
		Scanner scanner = new Scanner(System.in); 
		String turbo = scanner.next();
		if(turbo.equals("1")) 
			{
			System.out.println("Your " + make + " " + model + " is now turbocharged");
			isFaster = "turbocharged";
			switch(engine) 
				{
				case("V8"): 
					{
					XP += 10; 
					break; 
					}
				case("Straight Six"): 
					{
					XP += 20; 
					break; 
					}
				case("V6"): 
					{
					XP += 10; 
					break; 
					}
				case("Inline 4"): 
					{
					XP += 25; 
					break; 
					}
				case("Boxer"): 
					{
					XP += 30; 
					break; 
					}
				case("V12"): 
					{
					XP += 5; 
					break; 
					}
				case("V10"): 
					{
					XP += 5; 
					break; 
					}
				}
			}
		else if(turbo.equalsIgnoreCase("2")) 
			{
			System.out.println("Your " + make + " " + model + " is now supercharged");
			isFaster = "supercharged";
			switch(engine) 
				{
				case("V8"): 
					{
					XP += 20; 
					break; 
					}
				case("Straight Six"): 
					{
					XP += 10; 
					break; 
					}
				case("V6"): 
					{
					XP += 8; 
					break; 
					}
				case("Inline 4"): 
					{
					XP += 8; 
					break; 
					}
				case("Boxer"): 
					{
					XP += 8; 
					break; 
					}
				case("V12"): 
					{
					XP += 5; 
					break; 
					}
				case("V10"): 
					{
					XP += 5; 
					break; 
					}
				}
			
			}
		else 
			{
			System.out.println("Your " + make + " " + model + " is naturally aspirated.");
			isFaster = "naturally aspirated"; 
			switch(engine) 
				{
				case("V8"): 
					{
					XP += 20; 
					break; 
					}
				case("Straight Six"): 
					{
					XP += 15; 
					break; 
					}
				case("V6"): 
					{
					XP += 8; 
					break; 
					}
				case("Inline 4"): 
					{
					XP += 5; 
					break; 
					}
				case("Boxer"): 
					{
					XP += 5; 
					break; 
					}
				case("V12"): 
					{
					XP += 20; 
					break; 
					}
				case("V10"): 
					{
					XP += 20; 
					break; 
					}
				}
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
			System.out.println("Straight Six");
			System.out.println("V6");
			System.out.println("Inline 4");
			System.out.println("Boxer");
			String myEngineBA = scanner.next();
			engine = myEngineBA;
			switch(myEngineBA) 
				{
				case("V8"): 
					{
					turbo(); 
					System.out.println("Plus 25xp");
					XP += 5; 
					break; 
					}
				case("Straight Six"): 
					{
					turbo(); 
					System.out.println("Plus 20xp");
					XP += 10; 
					break; 
					}
				case("V6"): 
					{
					turbo(); 
					System.out.println("Plus 10xp");
					XP += 10; 
					break; 
					}
				case("Inline 4"): 
					{
					turbo(); 
					System.out.println("Plus 15xp");
					XP += 15; 
					break; 
					}
				case("Boxer"): 
					{
					turbo(); 
					System.out.println("Plus 15xp");
					XP += 15; 
					break; 
					}
				}
			}
		else if(make.equals("Lamborghini") || make.equals("Ferrari")) 
			{
			System.out.println("V12");
			System.out.println("V10");
			System.out.println("V8");
			String myEngineLF = scanner.next(); 
			engine = myEngineLF;
			switch(myEngineLF) 
				{
				case("V12"): 
					{
					turbo(); 
					System.out.println("Plus 5xp");
					XP += 5; 
					break; 
					}
				case("V10"): 
					{
					turbo(); 
					System.out.println("Plus 10xp");
					XP += 10; 
					break; 
					}
				case("V8"): 
					{
					turbo(); 
					System.out.println("Plus 15xp");
					XP += 15; 
					break; 
					}
				}
			}
		}
	@Override
	public void whatWheels() 
		{
		System.out.println("PLease chose from the selection of wheels.");
		System.out.println("1.Pirelli P-Zero");
		System.out.println("2.Goodyear Eagle RS");
		System.out.println("3.TOYO Proxes R888");
		System.out.println("4.TOYO Proxes RS1");
		Scanner scanner = new Scanner(System.in); 
		String theWheels = scanner.next(); 
		switch(theWheels) 
			{
			case("1"): 
				{
				System.out.println("Plus 20xp.");
				XP += 20;
				wheels = theWheels; 
				break; 
				}
			case("2"): 
				{
				System.out.println("Plus 20xp.");
				XP += 20;
				wheels = theWheels; 
				break; 
				}
			case("3"): 
				{
				System.out.println("Plus 15xp.");
				XP += 15;
				wheels = theWheels;
				break; 
				}
			case("4"):
				{
				System.out.println("Plus 20xp.");
				XP += 20;
				wheels = theWheels; 
				break; 
				}
			}
		}

	}
