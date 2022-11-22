/*-----------------------------------------------------------------------------------------------.
An Armstrong number is an n-digit number that equals the sum of the nth power 
of its digits. For example 153 is a three-digit number where the sum of the cubes 
of the individual digits (13 + 53 + 33) equals the number itself (153). 
 Write a program that takes as input the start and end numbers of an Armstrong 
number range to be printed. Your program should prompt for new start and end 
numbers until the user decides that she or he is through. Use variables of the type 
integer to store the start and end numbers of the range.
-----------------------------------------------------------------------------------------------*/
package absolutejava.chapter3;

class Q7 {
	public static void main(String[] args)
	{
		run();
	}
	
	public static void run()
	{
		 java.util.Scanner kb = new java.util.Scanner(System.in);
		 
		 for (;;) {
			 System.out.print("Enter a number to start of the Armstrong range: ");
			 int startVal = Integer.parseInt(kb.nextLine());
			 
			 System.out.print("Enter a number to end of the Armstrong range: ");
			 int endVal = Integer.parseInt(kb.nextLine());
			 
			 armstrongRange(startVal, endVal);
		 }
	}
	
	public static void armstrongRange(int a, int b)
	{
		for(int i = 0; i < b; i++) 	
			if(i > a && i < b && isArmstrong(i)) 
				System.out.printf("%d%n", i);	
	}
	
	
	public static boolean isArmstrong(int a)
	{
		return a == getDigitsPow(a) && a > 0;
	}
	
	public static int pow(int a, int b)
	{
		int result = 1;

		for (int i = 0; i < b; ++i)
			result *= a;
		
		return result;
	}
	
	public static int getDigitsPow(int a)
	{
		int digits = countDigits(a);
		int result = 0;
		
		while (a != 0) {
			result += pow(a % 10, digits);
			a /= 10;
		}
		
		return result;
		
	}
	
	public static int countDigits(int a)
	{
		int count = 0;
		
		while (a != 0) {
			++count;
			a /= 10;
		}
		
		return count;
	}
}

