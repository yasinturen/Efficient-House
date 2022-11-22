/*-----------------------------------------------------------------------------------------------.
			One way to measure the amount of energy that is expended during exercise is to 
		use metabolic equivalents (MET). Here are some METS for various activities: 
		 Running 6 MPH: 10 METS 
		 Basketball: 8 METS 
		 Sleeping: 1 MET 
		 The number of calories burned per minute may be estimated using the following 
		formula:
		 CaloriesjMinute = 0.0175 * MET * Weight in kilograms 
		 Write a program that calculates and outputs the total number of calories burned 
		for a 150-pound person who runs 6 MPH for 30 minutes, plays basketball for 
		30 minutes, and then sleeps for 6 hours. One kilogram is equal to 2.2 pounds.
-----------------------------------------------------------------------------------------------*/
package absolutejava.chapter1WithScanner;

class Q1 {
	public static void main(String[] args)
	{
		run();
	}
	
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		int running = 10; // unit : METS
		int basketball = 8; // unit : METS
		int sleeping = 1; // unit : METS
		
		System.out.print("Enter the running time in min: ");
		int runningTime = Integer.parseInt(kb.nextLine());
		
		System.out.print("Enter the basketball time in min: ");
		int basketballTime = Integer.parseInt(kb.nextLine());
		
		System.out.print("Enter the sleeping time in min: ");
		int sleepingTime = Integer.parseInt(kb.nextLine());
		
		System.out.print("Enter your weight in pound: ");
		double weight = Integer.parseInt(kb.nextLine());
		
		double burnedRunningCal = 0.0175 * running * runningTime * weight;
		double burnedBasketballCal = 0.0175 * basketball * basketballTime * weight;
		double burnedSleepingCal = 0.0175 * sleeping * sleepingTime * weight;
		
		System.out.printf("Total burned calories: %.2f cal", burnedRunningCal + burnedBasketballCal + burnedSleepingCal);
	}
}
