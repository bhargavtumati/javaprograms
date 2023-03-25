/* 1. Write a program to accept two numbers, one Arithmetic operator such as +, -, / , *  and print output of Arithmetic operation. 
   Write switch case to perform each operation. Handle ArithmeticException when you are performing division operation. 
*/
import java.util.*;
public class ArithmeticException {
    public static void main(String args[]) {
      System.out.println("enter two numbers");
      Scanner s=new Scanner(System.in);
      int a=s.nextInt();
      int b=s.nextInt();
      char o='/';
      switch(o){
        case '+':
              System.out.println(a+b);
          break;
        case '-':
              System.out.println(a-b);
          break;
        case '/':
          try{
          System.err.println(a/b);
          }
          catch(Exception e){
            System.out.println(e);
          }
          break;
        case '*':
          System.out.println(a*b);
          break;
      }
    }
}
