/*-----------------------------------------------------------------------------------------------.
		Write a program that outputs the number of hours, minutes, and seconds that 
 corresponds to 50,391 total seconds. The output should be 13 hours, 59 minutes, 
and 51 seconds. Test your program with a different number of total seconds to 
ensure that it works for other cases.
-----------------------------------------------------------------------------------------------*/

package absolutejava.chapter1;

class Q7 {
	public static void main(String[] args)
	{
		run();
	}
	
	public static void run()
	{	
		long second = 50391;
		System.out.printf("%d second is: ", second);
		
		displayDuration(second);
	}
	
	public static void displayDuration(long second)
	{
			
		if (second >= 0) {
			long hour = second / 3600;
			if (hour == 0) {
				System.out.print("");			
			}
			else {
			System.out.printf("%d hour ", hour);
			second -= hour * 3600;
			}
			
			
			long min = second / 60;			
			if (min == 0) {
				System.out.print("");			
			}
			else {
			System.out.printf("%d min ", min);
			second -= min * 60;
			}
			
			if (second == 0) {
				System.out.print("");			
			}
			else {
			System.out.printf("%d sec ", second);
			}		
		}		
	}
}
