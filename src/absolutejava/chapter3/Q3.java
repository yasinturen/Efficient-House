

/*-----------------------------------------------------------------------------------------------.
Weight is defined as the gravitational force acting on the mass of a body. The 
weight of a body with a mass of 1kg on Earth can be calculated with the formula 
given below. The weight is expressed in Newtons (N).

Weight on earth = (1 kg) * (9.81 m/s2) = 9.81 N

The weight of the same body in N can be calculated with another formula:
Weight on moon = ((1 kg) * (9.81 m/s2)) / 6 = 1.64 N

Write a program that takes as input the mass of a car in kilograms and then prompts 
the user to choose to calculate the car’s weight in Newtons either on Earth or on 
the Moon. The program should allow the user to enter new values and output the 
car’s weight on Earth or on the Moon till the user decides to exit. Use the double 
data type to store the mass.
-----------------------------------------------------------------------------------------------*/
package absolutejava.chapter3;

public class Q3 {
	public static void main(String[] args)
	{
		run();
	}
	
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Enter car weight: ");
			double weight = Double.parseDouble(kb.nextLine());
			
			if (weight < 0)
				return;
			
			System.out.printf("To calculate the car weight on earth enter: 1%nTo calculate your weight on moon enter: 2%nTo exit enter: 0%n");
			int a = Integer.parseInt(kb.nextLine());
		
			if (a == 1)
				System.out.printf("Car weight on earth is: %.2f N%n ", weightOnEarth(weight));
			if (a == 2)
				System.out.printf("Car weight on moon is: %.2f N%n ", weightOnMoon(weight));
			if (a == 0)
				break;
		}
	}
	
	public static double weightOnEarth(double weight)
	{
		return weight * 9.81;
	}
	
	public static double weightOnMoon(double weight)
	{
		return weight * 9.81 / 6;
	}
}


