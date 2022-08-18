// Java Program to add two numbers using a Method.

import java.util.Scanner;

public class MethodDemo {
	public static void main(String args[])
	{
		// Creating Scanner class object to take two numbers input from console
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number");
		int firstnum=sc.nextInt();
		System.out.println("Enter Second Number");
		int secnum=sc.nextInt();
		//Creating an object
		MethodDemo obj=new MethodDemo();
		//Calling method sum() using object and holding the result returned from method
		int result=obj.sum(firstnum,secnum);
		// Printing the result returned by the method
		System.out.println("Result="+result);
		sc.close();
	}
	// Method Definition: sum with two parameters
	 int sum(int fnum, int snum)
	{
		// Returning the result sum to the calling main method
		return(fnum+snum);
	}
}
/*The Objective of this program is to learn defining and calling methods.
Let's define a method named sum to add two numbers. 
Here the sum method takes two numbers as parameters, add and return the result to the main method.
Now let's see how to call a method. First taking two int numbers input from user through Scanner class
Then we'll create the object of class and call the method 
Final result could have been printed in sum method but approach used here is returning the result to main method and printing from there
in console.  
*/
