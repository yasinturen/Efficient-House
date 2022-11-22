/*-----------------------------------------------------------------------------------------------.
				(This is a version of Programming Project 2.1 from Chapter 2.) The Babylonian 
algorithm to compute the square root of a positive number n is as follows:
 1. Make a guess at the answer (you can pick n/2 as your initial guess).
 2. Compute r = n / guess.
 3. Set guess = (guess +r) / 2.
 4. Go back to step 2 until the last two guess values are within 1% of each other.
 Write a program that inputs a double for n, iterates through the Babylonian algorithm until the guess is within 1% of the previous guess and outputs the answer 
as a double to two decimal places. Your answer should be accurate even for large 
values of n.  
-----------------------------------------------------------------------------------------------*/

package absolutejava.chapter3;

class Q1 {
	public static void main(String[] args)
	{
		run();
	}
	
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Enter the a number: ");
		double n = Double.parseDouble(kb.nextLine());
		
		if(n < 0) {
			System.out.print("You entered a negative number. Try again.");
			return;
		}
		
		System.out.printf("The square root of %.2f is %.2f%n", n, babylonianAlgorithm(n));
		Test.babylonianAlgorithmTest(n);
	}
	
	public static double babylonianAlgorithm(double n)
	{
		double guess = n / 2;
		double previousGuess = guess;
		double differenceBetweenGuesses = 1;
		
		while (differenceBetweenGuesses >= 0.01) {
			double r = n / guess;
			guess = (guess + r) / 2;
			differenceBetweenGuesses = (previousGuess - guess) / guess;
			previousGuess = guess;
		}
		
		return guess;
	}
}

class Test {
	
	public static void babylonianAlgorithmTest(double n)
	{
		System.out.printf("[TEST] The square root of %.2f is %.2f%n", n, Math.sqrt(n));
		
		return;
	}
	
}


