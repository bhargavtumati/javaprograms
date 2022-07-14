/* JFM1T7_Assignment2:

   Create a Student Result Processing System for 3 students.
   
   Sample inputs: Console input roll numbers, names and 5 subject marks for each student
   
   Sample output: Display roll numbers, names and percentage obtained by all 3 students in the following format:
   Roll Number: 1
   Name: Shree Balaji
   Percentage: 99%

*/
import java.util.Scanner;
public class StudentResult {

//main method
public static void main (String[] args){
//initialize student constructor 3 times with different names
Student4 s1 =new Student4();
  Student4 s2 =new Student4();
  Student4 s3 =new Student4();
//Create an array and add the 3 student to it
Student4 s[]= {s1,s2,s3};
//create displayPercentage static method in that add a for loop for student array
for(int i=0;i<3;i++)
//calculate percentage
{
  s[i].getStudentInput();
}
  Student4.displayPercentage(s);
}

//display student details

//create getStudentInput method in that create a Scanner object and take input from user

//print 5 subject marks using for loop
     
}

//create Student class 
class Student4 {

//declare and initialize variables
static int total_marks=500;
  String name;
  int roll_no;
  int marks[]= new int[5];
  Scanner sc=new Scanner(System.in);
//add getters and setters method
  void getStudentInput()
  {
    System.out.println("Enter your name");
    name=sc.nextLine();
    System.out.println("enter your roll no");
    roll_no=sc.nextInt();
    System.out.println("enter your 5 subject marks");
    for(int i=0;i<5;i++)
      {
        marks[i]=sc.nextInt();
      }
  }
    static void displayPercentage(Student4 s[])
    {
      int sum;
    for(int i=0;i<s.length;i++)  
      {
        sum=0;
        for(int j=0;j<s[i].marks.length;j++)
        {
          sum+=s[i].marks[j];
        }
        System.out.println("Roll Number: "+s[i].roll_no);
        System.out.println("Name: "+s[i].name);
        System.out.println("Percentage: "+(sum*100/total_marks)+"%");
      }
}
}
  
