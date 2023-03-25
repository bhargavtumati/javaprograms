/* 3. Write a program to create 2 threads by extending from Thread class and create synchronized method called 
      withdraw(int amt) and access withdraw( ) from Thread1 and Thread 2.   */


public class Bank extends Thread {
  float balance=20000;
  synchronized void withdraw(int amount){
    balance-=amount;
    System.out.println("transaction done "+Thread.currentThread().getName());
  }
    public static void main(String args[]){
       Bank b=new Bank();
      Bank c=new Bank();
      b.start();
      b.withdraw(2000);
      c.start();
      c.withdraw(3000);
        
        
    }
}
