/*  JFM1T8_Assignment2:

    Write a program to find a substring in a string using an inbuilt method of String class.
    Prompt the user input from the terminal.
  
    Sample input: Learning made easy at bitLabs
    Enter search string : bitLabs
  
    Expected output: bitLabs is found
  
    Enter search string: bitlab
    Expected output: bitlab is not found
*/

import java.util.Scanner;

public class SubStringWithInbuilt {
public static void main(String args[]){
//main method
String s;
//declare variables
Scanner sc=new Scanner(System.in); 
//take input from user
  System.out.println("Enter string");
s=sc.nextLine();
//check if the string contains substring or not if contains print found else print not found
System.out.println("enter search string");
String ss=sc.nextLine();
  if(s.contains(ss))
    System.out.println(ss+" found");
  else
    System.out.println(ss+" not found");
}  
}