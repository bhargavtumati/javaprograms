/* 3. Write a program to create 2 threads by extending from Thread class and create synchronized method called 
      withdraw(int amt) and access withdraw( ) from Thread1 and Thread 2.   */

class ATMOperations {
	// declaring and initilizing acbal
     	double acbal=200000;
      
     	// creating synchronized method called withdraw()
    	synchronized void withdraw(int amt) {
        	acbal=acbal-amt;
        	System.out.println(amt+" rupees detucted by "+Thread.currentThread().getName());
		//print available balance
        	System.out.println("your account balance" +acbal);
    	}
}

class Thread1 extends Thread {
	// creating reference variable for ATMOperations class
    	ATMOperations obj;
    	// creating constructor and pass ATMOperations class object as argument
    	Thread1(ATMOperations obj){
        this.obj=obj;
      }
    	// overriding run() method 
    	public void run() {
        	// calling withdraw() method with ATMOperations class object
obj.withdraw(2000);        	
    	}
}
class Thread2 extends Thread {
	// creating constructor and pass ATMOperations class object as argument
        ATMOperations obj;
    	// creating constructor and pass ATMOperations class object as argument
    	Thread2(ATMOperations obj){
        this.obj=obj;
      }

    	public void run() {
        	// calling withdraw() method with ATMOperations class object
        	obj.withdraw(1500);
    	}
}
public class Bank_Sample {
    public static void main(String args[]){
        // creating two objects for ATMOperations
      ATMOperations h=new ATMOperations();
      ATMOperations j=new ATMOperations();
        Thread1 t1 =new Thread1(h);
      Thread2 t2 =new Thread2(j);
      t1.start();
t2.start();
        //calling start() with t1 and t2
        
        
    }
}
