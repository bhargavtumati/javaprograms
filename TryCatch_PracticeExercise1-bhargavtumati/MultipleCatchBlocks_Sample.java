/* 4. Write a program to declare array variable with 5 index positions. Accept a,b and k values from keyboard 
   and find division value and store in kth index position.Handle ArrayIndexOutOfBoundsException 
   if kth position is not present in array. And handle ArithmeticException if b value is zero.  
   Use multiple catch blocks to handle above two exceptions.
 */

import java.util.Scanner;
public class MultipleCatchBlocks_Sample {
   public static void main(String args[]) {
       int arr[]=new int[5];
       Scanner s=new Scanner(System.in);
       int  a,b,index;
       System.out.println("Enter index position to store division value");
       index=s.nextInt();
       System.out.println("Enter a and b values:");
       a=s.nextInt();
       b=s.nextInt();
       try {
          // store division of a and b in given index position of the array
arr[index]=(a/b);
       }
     catch(ArithmeticException f){
       System.out.println(f);
     }
     catch(ArrayIndexOutOfBoundsException e){
       System.out.println(e);
     }
   }
}
