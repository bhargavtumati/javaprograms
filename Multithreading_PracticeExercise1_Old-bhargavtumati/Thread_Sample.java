/* 6. Write a program to create thread by implementing from Runnable interface and accept two numbers 
      from user and find prime numbers between them.*/

// creating class Example and implementing from Runnable Interface
class Thread_Sample implements Runnable {
	//Declaring start,stop and count variable 
    	int start,stop,count=0;
    	// creating constructor
    	Thread_Sample(int start,int stop){
        	this.start=start;
        	this.stop=stop;
    	}
     	//overriding run() method
    	public void run() {
        	// finding factors 
       for(int i=start;i<=stop;i++){
       for(int j=1;j<i;j++){
         if(i%j==0){
           count++;
         }
       }

          		// checking factors count is equals to 1
          		if(count==1){
              			try{
    					// calling sleep method
                  Thread.sleep(10);			
       					System.out.print(i+"  ");
              			}
              			catch(Exception e){
                  			System.out.println(e);
              			}
          		}
          		// making count value is 0
       			count=0;
       		}       
  	}
	public static void main(String args[]) {
		// create object for Thread_Sample class and call start() method
		Thread_Sample t =new Thread_Sample(1,10);
		// creating object for Thread class 
		Thread h=new Thread(t);
		// calling start() method with object
		h.start();
 	}
 }
