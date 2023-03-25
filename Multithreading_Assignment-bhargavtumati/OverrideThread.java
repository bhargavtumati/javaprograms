/* 2. Write a program to create a Thread by extending from Thread class. Override run() method and in run() 
      method accept number of seconds from user and display countdown time. 
      
      Sample Input: 
      Enter Number of seconds: 60

      Expected Output:
      59 seconds to go..
      58 seconds to go..
      57 seconds to go..
      56 seconds to go..
*/
import java.util.*;
public class OverrideThread extends Thread  {
 public void run(){
   System.out.println("enter number of seconds:");
   Scanner sc=new Scanner(System.in);
   int sec=sc.nextInt();
   for(int i=sec;i>=0;i--){
     System.out.println(i+" seconds to go..");
     try{
     Thread.sleep(1000);
     }
     catch(InterruptedException e){
       System.out.println(e);
     }
     
   }
 } 

	public static void main(String args[]) {
	OverrideThread t1=new OverrideThread();
    t1.start();
	}
}

