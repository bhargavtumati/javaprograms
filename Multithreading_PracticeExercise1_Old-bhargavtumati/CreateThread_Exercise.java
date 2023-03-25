/*7. Write a program to create a new Thread by extending from Thread class, read data from studentdetails.txt 
     file using child Thread and read data from employee.txt file using main Thread. And print student details 
     first then employee details. Use join method to achieve this task. Before running this program create following files 
     • Create StudentDetails.txt file and enter 3 students’ information such as name, marks, college_name 
     • Create employee.txt and enter 3 employees’ information such as name, salary and department_name.*/
import java.io.*;
public class CreateThread_Exercise  extends Thread{
public void run(){
  try{
  FileReader fr=new FileReader("studentdetails.txt");
  int ch;
  while((ch=fr.read())!=-1){
    System.out.print((char)ch);
  }
  }
  catch(IOException e){
    System.out.println(e);}
  }
	public static void main(String args[]) {
	CreateThread_Exercise t1=new CreateThread_Exercise();
     t1.start();
    try{
    t1.join();}
    catch(Exception e){
      System.out.println(e);
    }
    try{
    FileReader fg=new FileReader("employee.txt");
    int gh;
    while ((gh=fg.read())!=-1){
      System.out.print((char)gh);
     
    }
    }
    catch(IOException e){
      System.out.println(e);
    }
    
	}
}
