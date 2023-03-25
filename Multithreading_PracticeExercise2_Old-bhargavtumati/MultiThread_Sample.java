/* 2. Write a program to create 3 threads by extending from Thread class and do following steps 
    . set new names for all three threads such as First Thread, second Thread, Third Thread
    . set MIN_PRIORITY,MAX_PRIORITY to Thread 1 and Thread2 
    . print all three thread names along with their priority's
*/

class MultiThread2 extends Thread{

	// override run() method
    	public void run(){
        	// printing Current Thread name and priority
        	System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());

    	}
}
public class MultiThread_Sample {
    public static void main(String[] args) {
    	// creating 3 objects for MultiThread2 class 
       MultiThread2 multiThread1=new MultiThread2();
      MultiThread2 multiThread2=new MultiThread2();
      MultiThread2 multiThread3= new MultiThread2();
        
        // set new name for Thread1
        multiThread1.setName("First Thread");
        // set MIN_PRIORITY to thread 1
        multiThread1.setPriority(Thread.MIN_PRIORITY);
        // set new name for Thread2
        multiThread2.setName("Second Thread");
        
        // set MAX_PRIORITY to thread 1
multiThread2.setPriority(Thread.MAX_PRIORITY);
        
        // set new name for Thread3

        multiThread3.setName("Third Thread");
      	// calling start()method with 3 objects
        multiThread1.start();
      multiThread2.start();
       multiThread3.start();
    }
}

