import java.util.Scanner; 
public class CarRunner 
{

	public static void main(String[] args) 
		{
		Car[] car = new Car[2];
		car[0] = new Performance();
		car[1] = new RaceCar(); 
		for(int i = 0; i < car.length; i++) 
			{
			car[i].whatType();
			car[i].whatEngine();
			car[i].whatWheels(); 
			}
		}
	
}
