/* 11. Write a program to accept an integer value in string format and check whether string contains only numerical values or not. 
   Display error message if string contains any special characters or spaces otherwise convert that value into an integer and print it.

   Sample Input: Enter integer value: 123
   Expected Output: 123
 
   Sample Input: Enter integer value: 12@3
   Expected Output: java.lang.NumberFormatException
*/
import java.util.*;
public class NumberFormatException_Exercise {

    public static void main(String args[]) {
   System.out.println("enter a word");
      Scanner sc=new Scanner(System.in);
      String s=sc.next();
      System.out.println(Integer.parseInt(s));
    }
}