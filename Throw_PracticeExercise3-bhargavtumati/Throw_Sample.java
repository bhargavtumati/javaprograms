/* 17. Write a program to accept withdrawal amount from keyboard and check user entered amount is valid or invalid amount. 
   [check whether amount is divisible with 100 or not].   If amount is not divisible with 100 then throw Exception along with some error message.
*/

import java.util.Scanner;

public class Throw_Sample {

        public static void main(String args[ ]) {
  		Scanner s=new Scanner(System.in);
                System.out.println("Enter withdrawal amount");
      	        int amount=s.nextInt();
                 // write the condition of multiples of 100.
                if(amount%100!=0	){
                 // throw Arithmetic Exception along with error message
                  throw new ArithmeticException("enter amount multiple of 100s");

                }
                else{
                  System.out.println("Success");
               }
        }												
}
