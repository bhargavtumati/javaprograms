/* 13. Write a code to find the larger of the two roots of a quadratic equation? 
   Use exception handling if the discriminant is less than 0 i.e., roots are not real?
   Returns the larger of the two roots of
   The quadratic equation (A*x*x) + (B*x) + C = 0.
   Throws an exception if (B*B)-(4*A*C )< 0.
    
   Sample Input: A=1, B= -2, C=1
   Expected Output = 1

   Sample Input: A=1,  B=2, C= 4
   Expected Output:- Error as Discriminant <0
*/
import java.util.*;
public class QuadraticEquation_Exercise {

    public static void main(String args[]) throws ArithmeticException {
      System.out.println("enter the values of A,B,C");
        int a,b,c;
      Scanner s=new Scanner(System.in);
      a=s.nextInt();
      b=s.nextInt();
      c=s.nextInt();
      float d=((b*b)-(4*a*c));
      if(d<0){
        throw new ArithmeticException("Error as Discriminant<0");
      }
      else{
        double r1=((-b+Math.sqrt(d))/(2*a));
        double r2=((-b-Math.sqrt(d))/(2*a));
        System.out.println(r1);}

    }
}