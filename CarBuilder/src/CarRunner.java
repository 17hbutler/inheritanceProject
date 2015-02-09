import java.util.Scanner; 
public class CarRunner 
{

	public static void main(String[] args) 
		{
		whatType(); 
		Car[] car = new Car[1];
		car[0] = new Performance();
		
		for(int i = 0; i < car.length; i++) 
			{
			
			}
		}
	public static void whatType() 
		{
		System.out.println("What type of car do you want to build. Performance, Utility, Standard.");
		Scanner scanner = new Scanner(System.in); 
		String answer = scanner.next(); 
		
		if(answer.equalsIgnoreCase("Performance")) 
			{
			makePerformance();
			}
		}
	public static void makePerformance() 
		{
		System.out.println("You have chosen to make a performance car.");
		System.out.println("Are you ready to begin. Yes or No");
		Scanner scanner = new Scanner(System.in); 
		String answer = scanner.next(); 
		if(answer.equalsIgnoreCase("yes")) 
			{
			Performance.whatMake(); 
			}
		else 
			{
			CarRunner.whatType();
			}
		}
	
}
