/* 1. Write a program to illustrate how to create a thread by extends from Thread class.*/

// creating class MyThread and extends from Thread class

public class MyThread extends Thread {
	// overriding run() method and print child thread message 10 times
  	public void run() {
        	for(int i=1;i<=10;i++) {
                	System.out.println("Child Thread");
       		}
	}
  
	public static void main(String args[]) {
 		// creating object for MyThread class 
  		MyThread t=new MyThread();
		// calling start() method with MyThread class object.
     		t.start();
    
		// print Main Thread message 10 times
    		for(int i=1;i<=10;i++) {
              		System.out.println("Main Thread");
    		}
  	}
}
