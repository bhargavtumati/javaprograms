/*  JFM1T8_Assignment3:

    Write a program to find a substring in a string without using an inbuilt method of String class.
    Prompt the user input from the terminal.
    
    Sample input: Learning made easy at bitLabs
    Enter search string: bitLabs
    
    Expected output: bitLabs is found
    
    Enter search string: bitlab
    Expected output: bitlab is not found

*/

import java.util.Scanner;

public class SubStringWithoutInbuilt {
public static void main(String args[]){
//main method
String s,sub;
//declare variables
Scanner sc=new Scanner(System.in);
//take input from user
System.out.println("enter string");
  s=sc.nextLine();
//compare two strings if the search string found or not without using inbuilt method isSubString()
System.out.println("enter word to search");
  sub=sc.nextLine();
  if(isSubString(s,sub))
      System.out.println(sub+" is found");
    else
      System.out.println(sub+" is not found");
    }
//creat isSubString method in that declare variable 

//check two strings if the search string is present then return true else return false
    static boolean isSubString(String s1,String s2)
  {
    for(int i=0;i<s1.length();i++)
      {
        if(s1.charAt(i)==s2.charAt(0))
        {
          int k=i+1;
          int count=1;
          for(int j=1;j<s2.length();j++)
            {
              if(s1.charAt(k)==s2.charAt(j))
              {
                k++;
                count++;
              }
              else break;
            }
          if(count==s2.length())
            return true;
        }
      }
    return false;
  }
}