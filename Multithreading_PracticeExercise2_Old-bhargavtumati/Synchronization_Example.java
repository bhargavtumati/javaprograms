/* 1. Write a program to illustrate synchronization, create a synchronized method called displayTable() 
      in Table class and access it from two Threads. */

// creating class called Table
class Table {
	// creating synchronized method called displayTable(int num)
     	synchronized void displayTable(int num) {
        	for(int i=1;i<=10;i++) {
                	// print num*i
                	System.out.println(num*i);
                	try {
                		//calling sleep() method
                        	Thread.sleep(1000);
               		}
                	catch(Exception e){
                		System.out.println(e);
              		}
            	}
     	}
}
class Thread1 extends Thread {
	Table t;
        // creating constructor for Thread1
        Thread1(Table t){
	        this.t=t;
      	}
	// overriding run() and calling displayTable() with Table class object
   	public void run() {
       		 t.displayTable(2);
   	}
}
class Thread2 extends Thread {
	Table t;
	// creating constructor for Thread
       	Thread2(Table t){
		this.t=t;
        }
	// overriding run() and calling displayTable() with Table class object

     	public void run() {
           	t.displayTable(5);
     	}
}
public class Synchronization_Example {
        public static void main(String args[]) {
       		//creating object for Table class, Thread1 and Thread2 classes
            	Table obj=new Table();
            	Thread1 t1=new Thread1(obj);
           	Thread2 t2=new Thread2(obj);
           	// calling start() using t1 and t2
            	t1.start();
            	t2.start();
      }
}
