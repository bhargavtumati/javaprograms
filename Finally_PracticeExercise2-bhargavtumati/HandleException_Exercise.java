/* 14.	Write a program to illustrate nested try and catch blocks. Write code which can throw ArithmeticException 
   in outer try block and write a code which can throw ArrayIndexOutOfBoundsException in inner try block.  
   Handle ArithmeticException and ArrayIndexOutOfBoundsException in catch blocks.  Print proper message in finally block. 
   If exception handled in inner catch block, then print: “Exception handled in inner catch block” message. 
   If exception handled in outer catch block, then print: “Exception handled in Outer catch block” message.
*/
import java.util.*;
public class HandleException_Exercise {

   public static void main(String args[ ]) {
     int a[]={1,2,3,4,5},b,c;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter value of b");
     b=sc.nextInt();
     System.out.println("enter value of c");
     c=sc.nextInt();
     try{
       System.out.println(b/c);
       try{
         System.out.println(a[5]);
       }
       catch(ArrayIndexOutOfBoundsException f){
       System.out.println("index 5 not available");
       }
     }
     catch(ArithmeticException e){
       System.out.println("cant divide by 0");
     }
     finally{
       System.out.println("finally block");
     }
     
     

   }

}