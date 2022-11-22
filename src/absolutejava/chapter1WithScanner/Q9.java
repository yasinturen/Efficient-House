/*-----------------------------------------------------------------------------------------------.
	A simple rule to estimate your ideal body weight is to allow 110 pounds for the 
first 5 feet of height and 5 pounds for each additional inch. Write a program with 
a variable for the height of a person in feet and another variable for the additional 
inches. Assume the person is at least 5 feet tall. For example, a person that is 6 feet 
and 3 inches tall would be represented with a variable that stores the number 6 
and another variable that stores the number 3. Based on these values, calculate and 
output the ideal body weight.
-----------------------------------------------------------------------------------------------*/
package absolutejava.chapter1WithScanner;

class Q9 {
	public static void main(String[] args)
	{
		run();
	}
	
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.println("Enter your height in feet: ");
        	int height = Integer.parseInt(kb.nextLine());
        	int minWeight = 110;
	        int heightInch = height * 12;
        	int bodyWeight = minWeight + (heightInch % 60) * 5;

      		System.out.printf("Height = %d[ft] = Ideal Body Weight: %d[pound]", height, bodyWeight);
	}
}
