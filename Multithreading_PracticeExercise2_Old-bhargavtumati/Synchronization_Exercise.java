/* 4. Write a program to create a two user Threads by implementing from Runnable interface. 
      Create synchronized method called printTable(int num) method in Test class and access from both the threads.*/
class Test{
  synchronized void printTable(int num){
    for(int i=1;i<=10;i++){
      System.out.println(num+"*"+i+"="+(num*i));
    }
  }
}
public class Synchronization_Exercise extends Test implements Runnable{
  public void run(){
    Test obj =new Test();
    obj.printTable(5);
  }
	public static void main(String args[]) {
	Synchronization_Exercise s1=new Synchronization_Exercise();
    Thread t=new Thread(s1);
Synchronization_Exercise s2=new Synchronization_Exercise();
    Thread t2=new Thread(s2);
    t.start();
    t2.start();
  }
}
