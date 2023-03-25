/*JFM1T9_Assignment2:
    Write a BankAccount class with members account_number and account_balance  and prevent other class objects 
    (assuming them as hackers who can steal your confidential information) to access BankAccount details.
    Steps to Follow:
    Step1: Create account_number and account_balance as member variables for BankAccount class
    Step 2: Add setter and getter methods for the above member variables 
    Prompt the user for the  values to be input from the terminal.

    Sample Input:
    Enter BankAccount Number : 6789023
    Enter Current Balance    : 67,000.89

    Expected Output:
    BankAccount Number : 6789023
    Current Balance    : 67000.89
    
*/
import java.util.*;
class BankAccount{ 
//declare account_number , account_balance
private long account_number;
  private double account_balance;
//create getters and setters
   public void setAtt(long a,double b){
  account_number=a;
  account_balance=b;}
public void getAtt(){
  System.out.println("BankAccount Number "+account_number);
  System.out.println("Current Balance "+account_balance);
}
  
}  

class ExpertHacker{ 

public static void main(String args[]) { 

//main method
Scanner sc=new Scanner (System.in);
//create Scanner object
System.out.println("Enter Bank Account Number:");
  long a=sc.nextLong();
  System.out.println("Enter Current Balance:");
  double b=sc.nextDouble();
//Take input from user
BankAccount obj =new BankAccount();
//Create an object of BankAccount class and set account_number and the account_balance
/*System.out.println(account_number);
  System.out.println(account_balance);*/
// Try accessing fields of BankAcccount class and check whether it's accessible 
obj.setAtt(a,b);
// or not. If not then try accessing it with it’s setter and getter methods. 
obj.getAtt();
// Print account_number and account_balance 

}   

} 

