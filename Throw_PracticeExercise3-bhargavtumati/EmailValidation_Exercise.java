/* 20. Write a program to accept email id and check whether email is correct or wrong, email id should contain @, (dot). 
   and should end with gmail.com or yahoo.com only.

   Sample Input: Enter your mail id: Satish@.com
   Expected Output:Invalid Email id

   Sample Input: Enter your mail id: Satish@gmail.com
   Expected Output:Valid Email id
*/
import java.util.*;
class InvalidEmailException extends Exception{
  InvalidEmailException(String s){
    super(s);
  }
}
public class EmailValidation_Exercise {

   public static void main(String args[ ]) throws InvalidEmailException {
System.out.println("enter your mail id:");
     Scanner sc=new Scanner(System.in);
     String s=sc.nextLine();
if(!s.contains("@gmail.com")&&!s.contains("@yahoo.com")){
       throw new InvalidEmailException("Invalid Email id");
     }
     else{
       System.out.println("Valid Email id");
     }
   }

}
