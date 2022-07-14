/* JFM1T7_Assignment5:

   Write a program to create a static method named dispCollegeName to print the value of a static variable  college_name initialized using static block.
   Access this method from another class and display college_name for 3 students who study in same college.
   Prompt the user for the  values to be input from the terminal

   Sample Input:
   Enter the student name: Sri
   Enter the student Roll no: 1
   Enter the student name: Balaji
   Enter the student Roll no: 2
   Enter the student name: Ram
   Enter the student Roll no: 3
   
   Expected Output:
   Student name: Sri
   Student Roll no: 1
   College Name : IIT
   Student name: Balaji
   Student Roll no: 2
   College Name : IIT
   Student name: Ram
   Student Roll no: 3
   College Name : IIT

*/
import java.util.Scanner;
public class StaticBlock {

//main method
public static void main(String[] args){
//initialize Student class constructor for three times
student s1=new student();
student s2=new student();
student s3=new student();  
  //Create an array and add the 3 student to it
student arr[]= new student[3];
  arr[0]=s1;
  arr[1]=s2;
  arr[2]=s3;
//take input from user 3 times using for loop 
for(int i=0;i<3;i++)
  {
    arr[i].setdetails();
    
  }
 for(int i=0;i<3;i++)
  { arr[i].display();
   student.displaycolname();
}
}
}
//creating Student class and declaring variables
class student{
//creating staticBlock in that give collegename
  int no;
  String name;
  static String college;
  static{
    college="SRK";
  }
//add getters and setters
  void setdetails(){
  Scanner sc=new Scanner(System.in);
  System.out.println("enter student name=");
  name=sc.nextLine();
  System.out.println("enter roll no");
no=sc.nextInt();
  }
//creating dispCollegename static method 
     void display()
       {
       System.out.println("student name:"+name+"\nroll no:"+no);
       }
static void displaycolname()
  {
    System.out.println("college name:"+college);
  }
}
