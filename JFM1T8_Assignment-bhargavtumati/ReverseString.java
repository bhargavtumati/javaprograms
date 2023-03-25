/*  JFM1T8_Assignment5:

    Write a program to reverse a string using StringBuffer. Reverse entire sentence in string and also reverse each word in the string. 
    Prompt the user input from the terminal.
    
    Sample input: Learning made easy at bitLabs
    
    Expected output:
    reversing entire string: sbaLtib ta ysae edam gninraeL
    reversing each word at its place: gninraeL edam ysae ta sbaLtib  
*/

import java.util.Scanner;

public class ReverseString {
public static void main(String args[]){
//main method
Scanner s=new Scanner(System.in);
  System.out.println("enter any string");
  StringBuffer a=new StringBuffer(s.nextLine());
//declare variables and take input from user
  
//creat stringbuffer object for string reversing
String rev="";
//reverse input string
for(int i=a.length()-1;i>=0;i--)
  rev+=a.charAt(i);
//print entire string result
System.out.println(rev);
  reverWordInMyString(a);
}
//call reverWordInMyString method
   static void  reverWordInMyString(StringBuffer str) 
     {
    String s=new String(str);
/* 
   Use split() method of String class splits
   a string in several strings based on the
   delimiter passed as an argument to it
*/ 
    String words[]=s.split(" ");
    String revWord="";
    for(String word:words)
      {
         for(int i=word.length()-1;i>=0;i--)
        {
/* 
   Use charAt() function returns the character
   at the given position in a string
*/          
          revWord+=word.charAt(i);
        }
        revWord+=" ";
      }
 //print reverse each word string result      
    System.out.println("Reversing each word at its place: "+revWord);
  }
}

