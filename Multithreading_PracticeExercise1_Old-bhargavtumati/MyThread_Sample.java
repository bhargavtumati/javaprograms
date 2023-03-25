/* 5. Write a program to create thread by extending from thread class and accept two numbers from user and print between values.*/

import java.util.*;
// creating class Example and extending from Thread class
class MyThread_Sample extends Thread {
	// creating object for Scanner class
  Scanner sc=new Scanner(System.in);    	     
     	//overriding run() method
    	public void run() {
        	// declare two integer variables called first, last
          	int first=0,last=0;
          	System.out.println("Enter first and last numebrs" );
          	// read two integer values
        first=sc.nextInt();
        last=sc.nextInt();
for(int i=first;i<=last;i++){
          	// iterate for loop from first to last
          	System.out.print(i+" ");

          		try{
          		Thread.sleep(100);
                // call sleep() method		
          		}
          		catch(Exception e){
                  		System.out.println(e);
          		}
       		}         
    	}
   	public static void main(String args[]) {
		MyThread_Sample m=new MyThread_Sample();
      m.start();
      // create object for MyThread_Sample class and call start() method
      
        	

     	}
 }
