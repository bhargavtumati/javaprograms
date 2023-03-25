/* 18. Given two numbers a1 and a2. Find the square root of their products. 
   Use Illegal argument exception handling if their product is negative.

   Sample Input: a= - 5, b = -20
   Expected Output: The square root of their product is 10

   Sample Input: a= 5, b = -20
   Expected Output: Exception: Square root of a negative number doesn’t exist
*/
import java.util.*;
class SquarerootException extends Exception{
  SquarerootException(String s){
    super(s);
  }
}
public class SquareRoot_Exercise {

   public static void main(String args[ ]) throws SquarerootException {
System.out.println("enter values of a and b");
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     int b=sc.nextInt();
     if((a*b)<0)
       throw new SquarerootException("Square root of a negative number doesn’t exist");
     else
      System.out.println(Math.sqrt((a*b)));
   }

}
