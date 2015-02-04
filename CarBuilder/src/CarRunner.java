import java.util.Scanner; 
public class CarRunner 
{

	public static void main(String[] args) 
		{
		whatType(); 
		}
	public static void whatType() 
		{
		System.out.println("What type of car do you want to build. Performance, Utility, Standard.");
		Scanner scanner = new Scanner(System.in); 
		String answer = scanner.next(); 
		
		if(answer.equalsIgnoreCase("Performance")) 
			{
			Performance.makePerformance();
			}
		if(answer.equalsIgnoreCase("Utility")) 
			{
			Utility.makeUtility();
			}
		if(answer.equalsIgnoreCase("Standard")) 
			{
			Standard.makeStandard();
			}
		}
}
