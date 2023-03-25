/*6. Write a program to illustrate Serialization:
  • Create employee class and accept employee name, employee city, empid and employee designation from keyboard. 
  • Convert employee object into byte Streams with help of ObjectOutputStream class and store converted employee object into employee file.
*/
import java.io.*;
class Employee implements Serializable{
  String name,city,designation;
  int empid;
  Employee(String name,String city,String designation,int empid){
    this.name=name;
    this.city=city;
    this.designation=designation;
    this.empid=empid;
  }
  void display(){
    System.out.println("your employee details"+name+" "+city+" "+designation+" "+empid);
  }
}
public class Serialization_Exercise {
    public static void main(String args[])throws IOException {
      Employee e=new Employee("Bhargav","Vijayawada","Software Engineer",1254);
      FileOutputStream fos= new FileOutputStream ("Employee");
      ObjectOutputStream oos =new ObjectOutputStream(fos);
      oos.writeObject(e);
      fos.close();
      oos.close();
      

    }
}
