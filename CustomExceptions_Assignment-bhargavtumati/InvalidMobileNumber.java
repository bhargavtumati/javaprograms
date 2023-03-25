/* 3.Write a program to create custom exception to validate mobile number. Create InvalidMobileNumber and throw this exception 
   whenever user enters the mobile number by not following the below conditions.

  ==> mobile number should contain only digits.
  ==> mobile number should contain only 10 digits.
  ==> mobile number should start with 9 or 8 or 7 or 6.

  Sample input: 
  Enter your mobile number: 4565333953
  Sample output: java.lang.InvalidMobileNumber: "Invalid mobile number"

  Sample input: 
  Enter your mobile number: 9884533953
  Sample output: Valid Mobile number
*/
 import java.io.*;
class InvalidMobileNumberException extends Exception{
  InvalidMobileNumberException(String s){
  super(s);
}
}
public class InvalidMobileNumber extends Exception {
    public static void main(String args[])throws IOException {
System.out.println("Enter mobile number");
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      try{
long m=Long.parseLong(br.readLine());
      
      if(m<6000000000l||m>9999999999l){
        throw new InvalidMobileNumberException("mobile number should start with 6,7,8,9 and mobile number need to be 10 digits");
      }
        else
        System.out.println("valid number");
      }
        
      catch(NumberFormatException e){
        System.out.println("enter only numbers");
      }
      catch(Exception e){
        System.out.println(e);
      }
    }
}