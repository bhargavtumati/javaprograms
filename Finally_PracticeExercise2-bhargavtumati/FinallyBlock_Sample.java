/* 11.	Write a program to accept a and b values and find division value and print on console screen. 
   Handle ArithmeticException if b value is zero.
*/

import java.util.Scanner;

public class FinallyBlock_Sample {
     public static void main(String args[]){
   	 // create object for scanner class
Scanner sc=new Scanner(System.in);
          System.out.println("Enter a and b values");
       int a=sc.nextInt(),b=sc.nextInt();
         // read a and b values


         try{
             System.out.println(a/b);
         }
         catch(Exception e){
             System.out.println("Can't divide by zero");
         }
        // write finally block and print some message
         finally{
             System.out.println("Finally block");
         }
        System.out.println("After finally block");
   }
}
