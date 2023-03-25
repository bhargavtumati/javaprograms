/* 2.	Write a program to create a method which can accept a and b values and find division value. 
   Throws ArithmeticException from method signature. Handle ArithmeticException in caller method  with help of try and catch blocks.
*/

import java.util.Scanner;

public class ThrowsExample_Sample {

  public void validate() throws ArithmeticException{
     // create object for Scanner class    
Scanner sc=new Scanner(System.in);
     System.out.println("Enter a and b value :" );
     int a,b;
     // read a and b values
a=sc.nextInt();
    b=sc.nextInt();
    System.out.println(a/b);
  }
  public static void main(String args[]){
    ThrowsExample_Sample obj=new ThrowsExample_Sample(); 
    // call validate method and handle exception using try and catch blocks.
    try{
obj.validate();
    }
    catch(ArithmeticException e){
      System.out.println(e);
    }
  }
}

