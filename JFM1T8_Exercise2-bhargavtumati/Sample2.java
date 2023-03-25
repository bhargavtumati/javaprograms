//Complete and execute this java program to search a word/substring in a string

import java.util.Scanner;
public class Sample2 {
	public static void main(String d[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	String s=sc.nextLine();
	System.out.println("Enter the substring to be searched");
	String ss=sc.nextLine();
	//Use substring method of String class for searching
	if(s.contains(ss))
    System.out.println("word found");
    else
    System.out.println("word not found");
  }
}