
public class CarRunner 
{

	public static void main(String[] args) 
		{
		Car [] car = new Car [3]; 
		car[0] = new Utility(); 
		car[1] = new Performance(); 
		car[2] = new Standard();
		
		for(int i = 0; i < car.length; i++) 
			{
				car[i].car();
				car[i].components();
				car[i].myTurbo.turbo(); 
			}
		}

}
