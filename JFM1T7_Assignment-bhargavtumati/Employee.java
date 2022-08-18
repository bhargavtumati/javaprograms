/* JFM1T6_Assignment1:

   Write an Employee class with any 3 properties and create 2 employee objects to store and display the data.
   Prompt the user for the 2 employees to be input from the terminal.

   Sample Input:
   Enter the Empid: 01
   Enter the Name: Sree
   Enter Salary: 1000
   Enter the Empid: 02
   Enter the Name: Balaji
   Enter Salary: 2000

   Expected Output:
   **** Stored data displayed below ****
   Employee id = 01
   Employee name = Sree
   Employee salary = 1000
   Employee id = 02
   Employee name = Balaji
   Employee salary = 2000

*/

import java.util.Scanner;

public class Employee {

//Declare the variables
int id;
  String name;
  int salary;
//Create a method getInput() 
public  void getInput(){
//create Scanner object
Scanner sc=new Scanner(System.in);
//take input from user
System.out.println("Enter Employee id:");
  id=sc.nextInt();
  System.out.println("Enter the name:");
  name=sc.next();
  System.out.println("Enter Salary:");
  salary=sc.nextInt();
}

//create display method
public void display(){

//Print Employee details
System.out.println(id+" "+name+" "+salary);
}
public static void main(String[] args){
//Create a Employee constructor with the two employees
Employee e1 = new Employee();
  e1.getInput();
  e1.display();
  Employee e2 = new Employee();
  e2.getInput();
  e2.display();
//check for loop to print two employee details

}
}
