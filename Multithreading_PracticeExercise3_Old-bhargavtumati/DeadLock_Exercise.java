/* 2. Write a program to create two Threads by extending from Thread class. And create two file like abc.txt file and xyz.txt file.
    • Thread1 should read data from abc.txt then it should read data from xyz.txt file and display on console.  
    • Thread2 should read data from xyz.txt then it should read data from abc.txt file and display on console.
    Create two synchronized blocks to achieve dead lock.  
*/
import java.io.*;
class Thread1 extends Thread{
  Object ob1="ABC";
  Object ob2="XYZ";
  public void run(){
    try{
    synchronized(ob1){
      FileReader fr=new FileReader("abc.txt");
      int ch;
      while((ch=fr.read())!=-1){
        System.out.print((char)ch);
      }
      synchronized(ob2){
        FileReader fz=new FileReader("xyz.txt");
        int ch1;
        while((ch1=fr.read())!=-1){
          System.out.print((char)ch1);
        }
      }
    }
  }
    catch(IOException e){
      System.out.println(e);
    }
}
}
class Thread2 extends Thread{
  Object ob1="ABC";
  Object ob2="XYZ";
  public void run(){
    try{
    synchronized(ob2){
      FileReader fr=new FileReader("xyz.txt");
      int ch;
      while((ch=fr.read())!=-1){
        System.out.print((char)ch);
      }
      synchronized(ob1){
        FileReader fz=new FileReader("abc.txt");
        int ch1;
        while((ch1=fr.read())!=-1){
          System.out.print((char)ch1);
        }
      }
    }
  }
    catch(IOException e){
      System.out.println(e);
    }
}
}
public class DeadLock_Exercise  {

	public static void main(String args[]) {
	Thread1 t1=new Thread1();
    Thread2 t2= new Thread2();
    t1.start();
    t2.start();
	}
}

