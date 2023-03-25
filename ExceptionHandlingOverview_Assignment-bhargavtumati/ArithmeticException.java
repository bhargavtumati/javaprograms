/* 1. Write a program which will illustrate ArthmeticException. Create a parameterized method which can take two values and print division of two numbers. 
Please write your comments regarding ArithmeticException such as "When ArithmeticException will occur in this program?"
*/
import java.util.*;
public class ArithmeticException {
void sum(int a,int b){
  System.out.println("sum: "+(a/b));
}
    public static void main(String args[]) {
ArithmeticException obj=new ArithmeticException();
      try{
      obj.sum(2,0);//here when the value of b given as 0, Arithmetic Exception occurs
      }
      catch(java.lang.ArithmeticException e){
        System.out.println(e);
      }
    }
}