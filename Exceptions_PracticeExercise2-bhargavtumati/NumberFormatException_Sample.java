/* 8. Write a program to accept a and b values from keyboard in string format and accept Arithmetic 
   operator [+, -, *,/] from keyboard to perform Arithmetic operations.
   Write switch case to separate each operation in different switch case. 
   Perform Arithmetic operation and print output on console. 
   To get NumberFormatException convert a and b values into integer before performing arithmetic operations.
*/

import java.util.Scanner;
public class NumberFormatException_Sample {
    public static void  main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a and b values ");
        // Read a and b values in String format
String c=s.next();
      String d=s.next();
int a=Integer.parseInt(c);
      int b=Integer.parseInt(d);
        System.out.println("Enter Arithmetic Operator [+ or - or * or /]");
       // read operator from keyboard
char operator=s.next().charAt(0);
       switch(operator){
           case '+':{
               // print addition of a and b
System.out.println(a+b);
               break;
           }
           case '-':{
               // print subtraction of a and b
System.out.println(a-b);
               break;
           }
           case '*':{
               // print Multiplication of a and b
System.out.println(a*b);
               break;
           }
           case '/':{
               // print Division of a and b
System.out.println(a/b);
               break;
           }
           default:{
               System.out.println("Invalid Operator");
           }
       }
    }
}
