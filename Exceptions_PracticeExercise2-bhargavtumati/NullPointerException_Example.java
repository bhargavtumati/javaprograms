/* 1. Write a program to illustrate NullPointerException. 
   --> Declare string variable and assign null value and perform following operations to get NullPointerException. 
   • Find number of characters in string variable.
   • Convert string to upper case.
   • Find number of words in a string.
*/

public class NullPointerException_Example {
    public static void main(String args[]){
        // declare str varaible and assign null to it
         String str=null;
         // print number of characters in str varaible
         System.out.println(str.length()); 
         // convert string to uppercase
         System.out.println(str.toUpperCase());
         // find number of words in given string 
         System.out.println(str.split(" ").length);
     }	
}

