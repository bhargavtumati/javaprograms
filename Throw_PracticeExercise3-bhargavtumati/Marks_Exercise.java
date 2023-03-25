/* 19. Write a program to accept marks and check whether marks are between 0 to 100, if marks are not between 0 to 100 
   throw some user defined message using throw keyword.

   Sample Input: Enter your marks: 120
   Expected Output: java.lang.Exception: invalid marks

   Sample Input: Enter your marks: 40
   Expected Output: Valid marks
*/
import java.util.*;
class InvalidMarksException extends Exception{
  InvalidMarksException(String s){
    super(s);
  }
}
public class Marks_Exercise {

   public static void main(String args[ ]) throws InvalidMarksException {
System.out.println("Enter your marks");
     Scanner sc=new Scanner(System.in);
     int marks=sc.nextInt();
     if(marks>100||marks<0)
     throw new InvalidMarksException("invalid marks");
     else
       System.out.println("Valid marks");
   }
}

