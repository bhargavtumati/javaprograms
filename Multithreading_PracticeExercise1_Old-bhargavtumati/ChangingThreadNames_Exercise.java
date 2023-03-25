/* 9. Write a program to create 5 user Threads by implementing from Runnable interface and  change all 
      thread names and print new Thread name along with Thread id’s on console.

      Sample Input: 
      Enter new name for Thread-0 :  bitLabs1
      Enter new name for Thread-1 :  bitLabs2
      Enter new name for Thread-2 :  bitLabs3
      Enter new name for Thread-3 :  bitLabs4
      Enter new name for Thread-4 :  bitLabs5

      Expected Output: 
      New Name for Thread-0 is: bitLabs1 and id is: 11
      New Name for Thread-1 is: bitLabs2 and id is: 12
      New Name for Thread-2 is: bitLabs3 and id is: 13
      New Name for Thread-3 is: bitLabs4 and id is: 14
      New Name for Thread-4 is: bitLabs5 and id is: 15
*/
import java.util.*;
public class ChangingThreadNames_Exercise implements Runnable  {
  public void run(){
   
   
  }

	public static void main(String args[]) {
	ChangingThreadNames_Exercise o0=new ChangingThreadNames_Exercise();
    Thread t0=new Thread(o0);
    
    ChangingThreadNames_Exercise o1=new ChangingThreadNames_Exercise();
    Thread t1=new Thread(o1);
    
    ChangingThreadNames_Exercise o2=new ChangingThreadNames_Exercise();
    Thread t2=new Thread(o2);
    
    ChangingThreadNames_Exercise o3=new ChangingThreadNames_Exercise();
    Thread t3=new Thread(o3);
    
    ChangingThreadNames_Exercise o4=new ChangingThreadNames_Exercise();
    Thread t4=new Thread(o4);
    Scanner sc=new Scanner(System.in);

  System.out.print("Enter new name for Thread-0 : ");
    t0.setName(sc.nextLine());
   System.out.print("Enter new name for Thread-1 : ");
    t1.setName(sc.nextLine()); 
  System.out.print("Enter new name for Thread-2 : ");
    t2.setName(sc.nextLine());
System.out.print("Enter new name for Thread-3 : ");
    t3.setName(sc.nextLine());
    System.out.print("Enter new name for Thread-4 : ");
    t4.setName(sc.nextLine());
    
    System.out.println("New Name for Thread-0 is: "+t0.getName()+" and id is: "+t0.getId());
     System.out.println("New Name for Thread-1 is: "+t1.getName()+" and id is: "+t1.getId());
      System.out.println("New Name for Thread-2 is: "+t2.getName()+" and id is: "+t2.getId());
     System.out.println("New Name for Thread-3 is: "+t3.getName()+" and id is: "+t3.getId());
     System.out.println("New Name for Thread-4 is: "+t4.getName()+" and id is: "+t4.getId());
	}
}
