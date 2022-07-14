// Java Program to demonstrate Student Class and it's Object creation
class Student
{ 
  // Declaring data members also known as instance variable here
 int id;	
 String name;

public static void main(String args[])
{  
  //Creating first object of Student  
   Student firstStudent=new Student();
   
  //Assigning values to data members
   firstStudent.id = 1;
   firstStudent.name = "Ram";
   
  //Creating second object of Student  
   Student secondStudent=new Student();
   
   //Assigning values to data members of secondStudent
   secondStudent.id = 2;
   secondStudent.name = "Sai";
   
   //Printing data members of first and second student object  
   System.out.println("id="+firstStudent.id+" "+"name="+firstStudent.name);  
   System.out.println("id="+secondStudent.id+" "+"name="+secondStudent.name); 
 }
}