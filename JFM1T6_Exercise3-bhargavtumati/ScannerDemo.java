//Java program to learn about taking input from user using an inbuilt class java.util.Scanner

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String args[]) {
	    
		//Creating Object of Scanner
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius of a circle");
		//Taking radius input from user using inbuilt method nextFloat() of Scanner class
		float radius = sc.nextFloat();
		
		// Calculating area of circle
		float area=2*3.14f*radius;
        
        // Printing the area in console
        System.out.println("Area="+area);

	}
}
/*Objective of this java program is to learn about taking input from user using an inbuilt class java.util.Scanner. 
First we import the inbuilt class that we require in the program. let's write import java.util.Scanner
Then we write our class and main method
To use the inbuilt class, let's create it's object - Scanner s=new Scanner(System.in)
Now let's use nextFloat() method of Scanner class to take floating point value say radius input from user. 
Other methods of Scanner are nextInt() for taking int, nextDouble() for taking double and nextLine() for string value as input from user in console.
Here we are using user input value of radius to calculate the area of circle and printing it in console.
*/