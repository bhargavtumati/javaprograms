/* 2. Write a program to perform ATM operations such as deposit, withdraw and balance enquiry. Display list of options for user selection. 
   Accept option from the user and execute specified method. throw Exception when user trying to withdraw amount more than 3 times.
*/
import java.util.*;
public class ATMOperations {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      float balance=200000;
    char y='y';
      int count=0;
      while(y=='y'){
      System.out.println("choose one option\n1.deposit\n2.withdraw\n3.display");
      int option =sc.nextInt(),n;
      
      switch(option){
        case 1:
          System.out.println("enter amount");
          n=sc.nextInt();
          balance+=n;
  System.out.println(n+" credited to your account");
          break;
        case 2:
          try{
          if(balance==0)
            throw new Exception("nil balance");
            else if (count==3){
            throw new Exception("cant withdraw more than three times");
          }
          else{
          System.out.println("enter amount");
          n=sc.nextInt();
         balance-=n;
    System.out.println(n+" withdrawn from account");
          count++;
          }}
          catch(Exception e){
            System.out.println(e);}
            break;
          
        case 3:
         System.out.println("your balance: Rs"+balance);
          break;
      }
        System.out.println("do you want transact again(y/n)");
        y=sc.next().charAt(0);
      }
    }
}
