/* 9. Write a code to take input two numbers a and b and print their integer division (a/b)? 
   Write exception handling for the case in which b is equal to 0?

   Sample Input:  a =4, b=2
   Expected Output: 2

   Sample Input:  a=2, b=0
   Expected Output: java.lang.ArithmeticException

*/
import java.util.*;
public class ArithmeticException_Exercise {

    public static void main(String args[]) {
      int a,b;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter two numbers");
      a=sc.nextInt();
      b=sc.nextInt();
      System.out.println(a/b);

    }
}