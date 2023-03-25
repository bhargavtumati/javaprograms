//Java program to demonstrate String and count total vowels in it.

import java.util.Scanner;
public class VowelCount{
	public static void main(String d[])
	{
	// Creating Scanner object for taking user input 
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");

	//Taking string input from console using nextLine() method of Scanner class
	String s=sc.nextLine();
	
	// Initializing variable count to 0
	int count=0;
	
	// Converting string to lowercase to limit the checks in if condition to match vowels
	String s1=s.toLowerCase();
	
	//Running a loop from index 0 till less than length()
	for(int i=0;i<s1.length();i++)
	{
	// Checking each character if it is a vowel	
	if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
	
	// Incrementing count by 1 if a vowel is encountered
	count++;
	}
	// Printing total count of vowels in console
	System.out.println("No. of vowels in the string are "+count);
	
	sc.close();
	}
}