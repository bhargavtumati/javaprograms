/* 3. Write a program to control execution order of the Threads using sleep() method.*/

// creating class called ThreadScheduling and extending from Thread class
public class ThreadScheduling extends Thread {
	// overriding run() method
   	public void run() {
        	// iterate for loop 10 times and print id of running Thread
        	for(int i=1;i<=10;i++) {
        		System.out.println(i+ " ID : "+ Thread.currentThread().getId());
             		try{
    				// call sleep() method
               			Thread.sleep(1000);
             		}
            		catch(Exception e){
                		System.out.println(e);
            		}
       		}
    	}
    	public static void main (String args[ ]){
        	// creating two objects for ThreadScheduling class 
        	ThreadScheduling t1=new ThreadScheduling();
        	ThreadScheduling t2=new ThreadScheduling();
        	// call getId() method and print on console
        	System.out.println("Id of T1: "+ t1.getId());
        	System.out.println("Id of T2: "+ t2.getId());
		// call start () method with both objects        
        	t1.start();
        	t2.start(); 
    	}
}
