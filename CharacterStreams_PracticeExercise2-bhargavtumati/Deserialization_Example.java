/* 2.Write a program to deserialize Student class object and display student name and marks on console. 
   Create a student class and print student_name and marks in display method of student class. 
   Deserialize student class object with help FileInputStream and ObjectInutputStream classes and display student name and marks on console. 
*/

import java.io.*;
class Student implements Serializable {
    // create name and marks variables
    String name;
    int marks;
    //create a constructor which can take name and marks as parameters
    Student(String name, int marks) {
        this.name=name;
        this.marks=marks;
    }
    // create display() method
    public void display() {
        System.out.println("Name: "+name);
        System.out.println("Marks: "+marks);
    }
}
public class Deserialization_Example {
    public static void main(String args[]) {
        try {
            //create object for FileInputStream and ObjectInputStream classes  
            FileInputStream out=new FileInputStream("student");
            ObjectInputStream oos=new ObjectInputStream(out);
             // call readObject() method with ObjectInputStream class object, then tycast into Student class 
             Student s=(Student)oos.readObject();
             // call display() method
            s.display();
            // close  stream connections
            oos.close();
            out.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}

