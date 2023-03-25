/* 3. Write a program to accept two integer variables from keyboard and find the quotient and print on console. 
   Handle ArithmeticException if user entered denominator value as zero. */

import java.util.Scanner;
public class TryAndCatch_Sample {
  public static void main(String args[ ]) {
     Scanner s=new Scanner(System.in);
     System.out.println("Enter a and b values :" );
     int a,b;
     // read a and b values
a=s.nextInt();
    b=s.nextInt();

    try {
      System.out.println(a/b);
    }
catch(ArithmeticException e){
  System.out.println(e);
}
    // write catch block to handle ArithmeticException



    System.out.println("After Exception");
  }
}
