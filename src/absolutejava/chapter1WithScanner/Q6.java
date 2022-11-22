/*-----------------------------------------------------------------------------------------------.
							Bicyclists can calculate their speed if the gear size and cadence is known. Gear size
			refers to the effective diameter of the wheel. Gear size multiplied by pi (3.14) gives 
			the distance travelled with one turn of the pedals. Cadence refers to the number of 
			pedal revolutions per minute (rpm). The speed in miles per hour is calculated by 
			the following: 
			 Speed [mph] = Gear Size (inches) * PI * (1[ft] / 12 [inches]) * (1[mile] / 5280 [ft]) * Cadence [rpm] * 60 [minutes] / [hour]
			 This is a program that calculates the speed for a gear size of 100 inches and a 
			 cadence of 90 rpm. This would be considered a high cadence and a maximum gear 
			size for a typical bicycle. In writing your program, don’t forget that the expression 
			1/12 will result in 0, because both 1 and 12 are integers, and when the integer 
			division is performed, the fractional part is discarded. 
-----------------------------------------------------------------------------------------------*/

package absolutejava.chapter1WithScanner;

class Q6 {
	public static void main(String[] args)
	{
		speedOfBicyclist();
	}
	
	public static void speedOfBicyclist()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Enter your gear size: ");
		double gearSize = Double.parseDouble(kb.nextLine());
				
		System.out.print("Enter your cadence: ");
		double cadence = Double.parseDouble(kb.nextLine());
		
		double pi = 3.14;
		double inchesToMile = (1. / 12.)* (1. / 5280.);
		double minToHour = 60;
		
		double speed = gearSize * pi * inchesToMile * cadence * minToHour;
		
		System.out.printf("Bicycle's speed is: %.2f mph", speed);
		
	}
}
