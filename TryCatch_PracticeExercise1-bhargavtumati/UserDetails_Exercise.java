/* 9. Write a program to accept user details such as name, email, marks and mobile number and print all details 
  if user details are in correct format. handle InputMismatchException if user entered values are in wrong format.

   Sample Input:
   Enter your name: Satish
   Enter email: satish@gmail.com
   Mobile: 989848Abc5

  Expected Output: java.lang.InputMissmatchException

 */
import java.util.*;
class InputMissmatchException extends Exception{
  InputMissmatchException(String s){
  super(s);
  }
}
public class UserDetails_Exercise {

   public static void main(String args[ ]) {
     Scanner sc=new Scanner(System.in);
       System.out.print("Enter your name: ");
     String name=sc.nextLine();
       System.out.print("Enter email: ");
     String email=sc.nextLine();
       System.out.print("Mobile: ");
     String mobile=sc.nextLine();
try{
  for(int i=0;i<name.length();i++){
    if(Character.isDigit(name.charAt(i))){
      throw new InputMissmatchException("Digit");
    }}
  for(int i=0;i<mobile.length();i++){
    if(Character.isLetter(mobile.charAt(i))){
      throw new InputMissmatchException("Letter");
        }
  }
  if(!email.contains("@gmail.com")){
    throw new InputMissmatchException("No @");
  }
 System.out.println(name+" "+email+" "+mobile); 
}   
     catch(Exception e){
       System.out.println(e);
     }
     
   }
}