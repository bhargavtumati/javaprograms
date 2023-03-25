// Java Program to search a word/substring in a string

import java.util.Scanner;
public class SearchString 
{
	public static void main(String d[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	String s=sc.nextLine();
	System.out.println("Enter the substring to be searched");
	String ss=sc.nextLine();
	if(s.contains(ss))
	{
	 System.out.println("word found");
	}
	else
	System.out.println("word not found");
	sc.close();
	}
}