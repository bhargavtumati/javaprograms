// Create an Employee Management Application initializing 3 Employee objects by taking input from user and printing the details.
//Hint: Refer Student Application. 
// Main Class
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Exercise2 {
int emplid;
String name;
float marks;
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  Exercise2 () throws IOException
  {
    System.out.println("Enter emplid");
    emplid=Integer.parseInt(br.readLine());
    System.out.println("Enter name");
    name=br.readLine();
    System.out.println("Enter marks");
    marks=Float.parseFloat(br.readLine());
  }
void display()
  {
    System.out.println(emplid+" "+name+" "+marks);
  }

public static void main(String[] args)throws IOException {
  Exercise2 e1 = new Exercise2();// Employee {
  e1.display();
  Exercise2 e2 = new Exercise2();
  e2.display();
    Exercise2 e3 = new Exercise2();
  e3.display();
}
}