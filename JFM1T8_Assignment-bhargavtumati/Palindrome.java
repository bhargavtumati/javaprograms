/*  JFM1T8_Assignment4:

    Write a program to check whether a string is a Palindrome.
    Prompt the user input from the terminal.
    
    Sample input: Malayalam
    
    Expected output: Malayalam is a Palindrome
*/

import java.util.Scanner;

public class Palindrome {

//main method
public static void main(String args[]){
//declare varible
String a;
//take input from user
  System.out.println("enter string");
Scanner s= new Scanner(System.in);
  a=s.nextLine();
/* 
   divide the whole string into two halves and compare each character in the 
   first half with each character in the second half in reverse.  
   If both are equal then it is a palindrome else print it is not a palindrome 
*/
  String rev="";
for(int i=a.length()-1;i>=0;i--)
  rev+=a.charAt(i);
  System.out.println(rev);
  if(rev.equals(a))
    System.out.println("palindrome");
  else
    System.out.println("not palindrome");
  }

}