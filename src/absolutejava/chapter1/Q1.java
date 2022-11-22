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
package absolutejava.chapter1;

class Q1 {
	public static void main(String[] args)
	{
		run();
	}
	
	public static void run()
	{
		int running = 10; // unit : METS
		int basketball = 8; // unit : METS
		int sleeping = 1; // unit : METS
		
		int runningTimeInMin = 30;
		int basketballTimeInMin = 30;
		int sleepingTimeInMin = 6 * 60;
		
		double weight = 150 / 2.2; // 1 kg = 2.2 pound
		
		double burnedRunningCal = 0.0175 * running * runningTimeInMin * weight;
		double burnedBasketballCal = 0.0175 * basketball * basketballTimeInMin * weight;
		double burnedSleepingCal = 0.0175 * sleeping * sleepingTimeInMin * weight;
		
		System.out.printf("Total burned calories: %.2f cal", burnedRunningCal + burnedBasketballCal + burnedSleepingCal);
	}
}
