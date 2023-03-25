/*1. Write a program to create a new Thread by extending from Thread class, read data from studentdetails.txt 
     file using child Thread and read data from employee.txt file using main Thread. And print student details 
     first then employee details. Use join method to achieve this task. Before running this program create following files 
     • Create StudentDetails.txt file and enter 3 students’ information such as name, marks, college_name 
     • Create employee.txt and enter 3 employees’ information such as name, salary and department_name.*/
import java.io.*;
public class CreateThread  extends Thread{
public void run(){
  try{
  FileReader fw=new FileReader("studentdetails.txt");
  int ch;
  while((ch=fw.read())!=-1){
    System.out.print((char)ch);
  }
  }
    catch(Exception e){
      System.out.print(e);
    }
}
	public static void main(String args[])throws IOException, FileNotFoundException,InterruptedException {
	CreateThread c=new CreateThread();
    c.start();
    c.join();
    FileReader fw=new FileReader("employee.txt");
    int ch;
    while((ch=fw.read())!=-1){
      System.out.print((char)ch);
    }
	}
}
