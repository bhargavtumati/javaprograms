/* 2. Write a program to illustrate how to create a thread by implements from Runnable Interface.*/

// creating class MyThread and implementing from Runnable interface
public class MyThread2 implements Runnable {
	// override run() method
        public void run() {
		// print child thread message 10 times
           	for(int i=1;i<=10;i++) {
               		System.out.println("Child Thread");
            	}
    	}
	public static void main(String args[]) {
		// creating object for MyThread2 class 
    		 MyThread2 t=new MyThread2();
		// Creating object for Thread class and pass Mythread class object as parameter
       		Thread obj=new Thread(t);
		// calling start() method with object
       		 obj.start();
		// Print Main Thread message 10 times
 		for(int i=1;i<=10;i++) {
              		System.out.println("Main Thread");
     		}
  	}
}
