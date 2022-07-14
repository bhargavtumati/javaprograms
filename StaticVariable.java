/*  JFM1T7_Assignment4:

    Write a program to declare a static variable roll_number inside student class. Create 3 student objects and print their names and roll numbers.
    Hint: Use increment operator to get different value of roll_number for 3 students.

   
    Expected Output:
    Roll no:1  Name: Shree 
    Roll no:2  Name: Balaji
    Roll no:3  Name: Ajay
*/

public class StaticVariable {

//main method
public static void main(String[] args){
//initializing Student class constructor by 3 times and passing 3 student names

  //displaying student name and roll number
     Student1 s1 =new Student1("bhargav");
  s1.display();
  Student1 s2=new Student1("tharun");
  s2.display();
  Student1 s3=new Student1("bhasker");
s3.display();
}
  
}

//declare Student class andd add declare name, rollno(static)
class Student1{
  static int roll_no=0;
    String name;
//add getters and setterss
    
    Student1(String alias)
    {
      name=alias;
      roll_no++;
    }
  void display(){
  System.out.println("Roll no: "+roll_no+" "+"Name: "+name);
}
}
