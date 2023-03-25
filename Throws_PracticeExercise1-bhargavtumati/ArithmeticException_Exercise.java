/* 4. Write a Program with a division method who receives two integer numbers and performs the 
   division operation. The method should declare that it throws ArithmeticException. 
   This exception should be handled in the main method.
*/
import java.util.*;
public class ArithmeticException_Exercise {

   public static void main(String args[ ]) {
System.out.println("enter any two values");
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt(),b=sc.nextInt();
     if(b==0){
       throw new ArithmeticException("cant divide by zero");
     }
     else
       System.out.println("quotient is "+a/b);
   }

}
