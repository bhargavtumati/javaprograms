/* 1. Write a program to declare two integer variables and initialize with some values. Later find the quotient and print on console. 
   Handle ArithmeticException if denominator is zero. */

public class TryAndCatch {
   public static void main(String args[ ]) {
      // declare a and b values and assign a=10 and b=0
        int a=10,b=0;
        try {
           // perform a/b
           System.out.println(a/b);
        }
        catch(Exception e){
          System.out.println("Can't divide by zero");
        }
   System.out.println("After Exception");
   }
}
