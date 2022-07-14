/* JFM1T7_Assignment1:

   Write a program to initialize data members of Student class using constructor.
   Prompt the user for the  values to be input from the terminal

   Sample Input:
   Enter student name: Shree Balaji
   Enter student Roll no: 01

   Expected Output:
   Name: Shree Balaji    Roll no: 01

*/

import java.util.Scanner;

public class StudentConstructor {

//main method
public static void main(String[] args){
//initialize Student class using constructor
  
//Get student name and rollno from user and set it to the Student object  

//print result
{
    Scanner sc=new Scanner(System.in);
    Student3 s=new Student3();
    System.out.print("Enter student name: ");
    s.setName(sc.nextLine());
    System.out.print("Enter student Roll no: ");
    s.setRollNo(sc.nextInt());
    System.out.println("Name: "+s.getName()+"   "+"Roll No: "+s.getRollNo());
  }
}
}

//Create Student class in that declare variables name and roll number 
class Student3
  {
   String name;
    int rollNo; 
//add  setter method for rollno
public void setRollNo(int rollNum){ 
         this.rollNo = rollNum; 
} 

//add getter method for rollno
public int getRollNo(){ 
      return this.rollNo; 
} 
  //add setters and getters for name fields also  
public void setName(String name){ 
         this.name=name;
} 
    public String  getName(){ 
      return this.name; 
  } 
  }
