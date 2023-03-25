/* 15. Write a method for Withdraw amount from ATM. implement Deposit method and withdraw method. 
   Withdraw limit is 20000 per transaction, if user is trying to withdraw more than 20000 then display error 
   message and terminate the program, print available balance in finally block before termination of program.
*/
import java.util.*;
public class BankTransaction_Exercise {
 double balance=0;
  void Deposit(int amount){
    balance+=amount;
  }
 void  Withdraw(int amount){
    balance-=amount;
  }

   public static void main(String args[ ]) {
System.out.println("Choose one option \n1.Withdraw \n2.Deposit");
     Scanner sc=new Scanner(System.in);
     int option=sc.nextInt();
     BankTransaction_Exercise n=new BankTransaction_Exercise();
    try{ if(option==1){
       System.out.println("enter amount:");
     int amount=sc.nextInt();
       if(amount>20000){
         throw new Exception("you cant withdraw more than 20000");
       }
       else if(n.balance>amount){
         n.Withdraw(amount);
       }
      else
         System.out.println("insufficient balance");
     }
if(option==2){
  System.out.println("enter amount");
  int amount=sc.nextInt();
n.Deposit(amount);
}}
     catch(Exception e){
       System.out.println(e);
     }
       finally {
  System.out.println("your balance: "+n.balance);
       }
     }
   }
