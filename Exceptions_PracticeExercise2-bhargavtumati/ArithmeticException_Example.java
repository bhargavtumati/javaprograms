/* 5. Write a program to illustrate ArithmeticException. 
   Accept a and b values from keyboard and print a/b. To get ArithmeticException enter denominator value is zero.
*/

import java.util.Scanner;
public class ArithmeticException_Example {
    public static void main(String args[]) {
        //create object for Scanner class
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a and b values to perform division operation: ");
        // accept a and b values 
        int a=s.nextInt();
        int b=s.nextInt();
        //perform division operation
        System.out.println(a/b);
    }
}

