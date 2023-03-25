/* 2. Write a program to create custom exception to perform deposit and withdraw options. 
      Create InvalidAmountException and throw this exception whenever user trying to deposit or withdraw invalid amount. 
      Deposit and withdraw amount should be multiples of 100 and it should be positive value.
*/
import java.io.*;
class InvalidAmountException extends Exception{
  
  InvalidAmountException(String s){
    super(s);
  }
}

public class CustomException {

    public static void main(String args[])throws IOException {
      System.out.println("enter the amount you want to deposit or withdraw");
      BufferedReader bw=new BufferedReader(new InputStreamReader(System.in));
      int amount=Integer.parseInt(bw.readLine());
      try{
if(amount%100!=0||amount<100){
  throw new InvalidAmountException("amount should be multiple of 100 and need to be positive");
}
    }
      catch(InvalidAmountException e){
        System.out.println(e);
      }
    }
}
