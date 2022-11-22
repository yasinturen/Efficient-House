/*-----------------------------------------------------------------------------------------------.
It is difficult to make a budget that spans several years, because prices are not stable. 
If your company needs 200 pencils per year, you cannot simply use this year’s price 
as the cost of pencils two years from now. Because of inflation, the cost is likely to 
be higher than it is today. Write a program to gauge the expected cost of an item in 
a specified number of years. The program asks for the cost of the item, the number 
of years from now that the item will be purchased, and the rate of inflation. The 
program then outputs the estimated cost of the item after the specified period. 
Have the user enter the inflation rate as a percentage, such as 5.6 (percent). Your 
program should then convert the percent to a fraction, such as 0.056 and should 
use a loop to estimate the price adjusted for inflation.
-----------------------------------------------------------------------------------------------*/
package absolutejava.chapter3;

class Q4 {
	public static void main(String[] args)
	{
		run();
	}

	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("How much the item costs now? : ");
		double currentItemCost = Double.parseDouble(kb.nextLine()); 
		
		System.out.print("How many years later will you purchase the item again? :  ");
		double year = Double.parseDouble(kb.nextLine());
		
		System.out.print("How much is the infilation rate in percentages? : ");
		double infilation = Double.parseDouble(kb.nextLine());
		
		System.out.printf("This item will cost %.2f dollar after %.0f years from now", expectedCost(currentItemCost, year, infilation), year);
	}
	
	public static double expectedCost(double currentItemCost, double year, double infilation)
	{	
		for (int i = 0; i < year; i++) 
			currentItemCost += currentItemCost * infilation / 100;
		return currentItemCost;
	}
}

