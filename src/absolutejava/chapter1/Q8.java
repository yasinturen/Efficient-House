/*-----------------------------------------------------------------------------------------------.
		The following program will compile and run, but it uses poor programming style. 
Modify the program so that it uses the spelling conventions, constant naming 
conventions, and formatting style recommended in this book .
		
		
		public class messy { 
		 public static void main(String[] args) 
		 {
		 double TIME; double PACE; 
		 System.out.println("This program calculates your pace given a time 
		and distance traveled."); 
		 TIME = 35.5;  (35 minutes and 30 seconds) 
		 PACE = TIME / distance; 
		 System.out.println("Your pace is " + PACE + " miles per hour."); 
		 } 
		public static final double distance = 6.21; 
		 } 
-----------------------------------------------------------------------------------------------*/

package absolutejava.chapter1;

class Q8 {
	public static void main(String[] args)
	{
		pace();
	}
	
	public static void pace()
	{
		double timeInMinsAndSecs = 35.5;
		double distanceInMiles = 6.21;
		double pace = timeInMinsAndSecs / distanceInMiles;
		
		System.out.printf("Your pace is %.2f miles per hour", pace);
	}
}
