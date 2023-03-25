/* 7. Write a program to illustrate Serialization and deserialization:
   • Create student class and accept student name, marks, city and mobile number form keyboard.
   • Convert student object to byte streams and store in in student.txt file.
   • Read data from student.txt file and print student name, marks, city and mobile number.  
*/
import java.io.*;
class Student2 implements Serializable{
  String name,city;
  int marks;
  long mobile;
  Student2(String name,String city,int marks,long mobile){
    this.name=name;
    this.city=city;
    this.marks=marks;
    this.mobile=mobile;}
    void display(){
      System.out.println("student details "+name+" "+city+" "+marks+" "+mobile);
    }
  }
public class SerializationDeserialization_Exercise {

    public static void main(String args[])throws IOException, ClassNotFoundException {
    Student2 s=new Student2("Bhargav","Vijayawada",945,6492241458l);
      FileOutputStream fos=new FileOutputStream("student");
      ObjectOutputStream oos=new ObjectOutputStream(fos);
     oos.writeObject(s);
      fos.close();
      oos.close();
      FileInputStream fis=new FileInputStream("student");
      ObjectInputStream ois =new ObjectInputStream(fis);
      Student2 j=(Student2)ois.readObject();
      j.display();
      fis.close();
        ois.close();
    }
}