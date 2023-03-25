/* 1. Write a program to illustrate dead lock situation, create two objects and access them from two objects. 
      Create two synchronized blocks for locking two objects, Thread1 should lock object1 then object2 same 
      Thread2 should lock object2 then object1. */

class Thread1 extends Thread {
    // creating two reference variables for object class 
    Object ob1="Abc";
    Object ob2="Xyz";
    // overriding run() method
    public void run(){
    	while(true){
 		// locking ob1    
              	synchronized(ob1){
                	System.out.println("Ob1 locked by "+Thread.currentThread().getName());
                	try{
                		// calling sleep() method
                        	Thread.sleep(1000);
                	}
                	catch(Exception e){
                       		System.out.println(e);
                 	}
			// locking ob2
        		synchronized(ob2){
            			System.out.println("Ob2 locked by "+Thread.currentThread().getName());
        		}
        	}
        }
    }
}
class Thread2 extends Thread {
	// creating two reference variables for object class 
	Object ob1="Abc";
    	Object ob2="Xyz";
	//override run() method
    	public void run(){
       		while(true) {
			// locking ob2
        		synchronized(ob2){
            			System.out.println("Ob2 locked by "+Thread.currentThread().getName());
         			try{
					// calling sleep() method
            				Thread.sleep(1000);
        			}
        			catch(Exception e){
            				System.out.println(e);
        			}
        			// locking ob1
        			synchronized(ob1){
            				System.out.println("Ob1 locked by "+Thread.currentThread().getName());
        			}
        		}
       		}
   	}
} 
public class DeadLock_Example {
    
    public static void main(String args[]) {
        
    	// creating object for Thread1 and Thread2
        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();
	// calling start() with t1 and t2
        t1.start();
        t2.start();
        
    }
}
