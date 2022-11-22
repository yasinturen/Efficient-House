/*-----------------------------------------------------------------------------------------------.
The Fibonacci numbers Fn are defined as follows: F0 is 1, F1 is 1, and
 Fi+2 = Fi + Fi+1
 i = 0, 1, 2, . . . . In other words, each number is the sum of the previous two numbers. The first few Fibonacci numbers are 1, 1, 2, 3, 5, and 8. One place where these 
numbers occur is as certain population growth rates. If a population has no deaths, 
then the series shows the size of the population after each time period. It takes an 
organism two time periods to mature to reproducing age, and then the organism 
reproduces once every time period. The formula applies most straightforwardly to 
asexual reproduction at a rate of one offspring per time period. In any event, the 
green crud population grows at this rate and has a time period of five days. Hence, if 
a green crud population starts out as 10 pounds of crud, then in 5 days, there is still 
10 pounds of crud; in 10 days, there is 20 pounds of crud; in 15 days, 30 pounds; 
in 20 days, 50 pounds; and so forth. Write a program that takes both the initial size 
of a green crud population (in pounds) and a number of days as input and outputs 
the number of pounds of green crud after that many days. Assume that the population size is the same for four days and then increases every fifth day.
Your program should allow the user to repeat this calculation as often as desired
-----------------------------------------------------------------------------------------------*/
package absolutejava.chapter3;

class Q6 {
	public static void main(String[] args)
	{
		run();
	}
	
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for(;;) {
	        	System.out.print("Enter the size in pounds of the current population: ");
	        	int size = Integer.parseInt(kb.nextLine());
	        
	        	System.out.print("Enter the days after that you will observe the population: ");
	        	int days = Integer.parseInt(kb.nextLine());
	        	
	        	if (size < 0  && days < 0) {
	    			System.out.print("You entered a negative value. Try again.");
	    			return;
	    		}        	
	        	displayPopulation(size, days);
		}
		
	}
	
	public static void displayPopulation(int size, int days)
	{				
		System.out.printf("The size of the population after %d days are %d%n", days, getFibonacciNumber(days / 5, size));
	}
	
	public static int getFibonacciNumber(int n, int size)
	{
		if (n < 1) {
			return -1;
		}
		
		else {
			int f1 = 0;
			int f2 = size;
			int fn = size;		
			
			
			for (int i = 0; i < n; ++i) {
				fn = f1 + f2;
				f1 = f2;
				f2 = fn;
			}
			return fn;
		}
	}
}

