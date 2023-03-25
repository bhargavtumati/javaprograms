/* 1. Write a program to serialize Student class object and store in student file. 
   Create a student class and add name, marks as parameters in student class constructor. 
   Serialize student class object with help FileOutputStream and ObjectOutputStream classes and store in student file.
*/

import java.io.*;

class Student implements Serializable{
    // declare name and marks variables
    String name;
    int marks;
    // create a constructor which can take name and marks as parameters
    Student(String name, int marks){
        this.name=name;
        this.marks=marks;
    }
  public void display() {
        System.out.println("Name: "+name);
        System.out.println("Marks: "+marks);
    }
}
public class Serialization_Example {
    
    public static void main(String args[]) {
    // create object for Student class and pass name and marks as values
      Student s=new Student("Rakesh",100);    
        try{
            // create obejct for FileOutputStream and ObjectOutputStream classes
            FileOutputStream out=new FileOutputStream("student");
            ObjectOutputStream oos=new ObjectOutputStream(out);
            // call writeObject() with ObjectOutputStream class object
            oos.writeObject(s);
            oos.flush();
            //close stream connections
            oos.close();
            out.close();
         }
        // Create catch block for IOException
         catch(IOException e){
            
            System.out.println(e);
         }
     }
}
