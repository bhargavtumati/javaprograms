/* 1. Write a program to create custom exception to validate password.
      Create InvalidPasswordFormatException and throw this exception
      whenever the user enters the password by not following the below conditions.
      ==> Password should contain at least one digit.
      ==> Password should contain at least one uppercase letter.
      ==> Password should contain at least one lowercase letter.
      ==> Password does not allow space and special characters.

  Sample Input: 
  Enter your password: Password@123
  Sample output: Valid password

  Sample Input: 
  Enter your password: abc123
  Sample output: java.lang.InvalidPasswordFormatException: "Sorry, Invalid passowrd"
*/
import java.io.*;
public class InvalidPasswordFormatException extends Exception {
InvalidPasswordFormatException(String s){
  super (s);
}
    public static void main(String args[])throws IOException {
      System.out.println("Enter Password");
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      String p=br.readLine();
      char ch[]=p.toCharArray();
      int Upper=0,Lower=0,Number=0,Other=0;
      for(char c:ch){
        if(c>='A'&&c<='Z'){
          Upper++;
        }
        if(c>='a'&&c<='z'){
          Lower++;
        }
        if(c>='0'&&c<='9')
          Number++;
        else if(c==' ')
          Other++;
      }
      try{
      if(Upper==0||Lower==0||Number==0||Other>0){
        throw new InvalidPasswordFormatException("invalid paasword format");
      }
        else
        System.out.println("Valid password");
      }
      catch(Exception e){
        System.out.println(e);
      }

    }
}
