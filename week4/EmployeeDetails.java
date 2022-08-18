/*Write a program that would print the information(name,year of joining,salary,address) of three employees by creating a class named 'Employee'. The output should be as follows:
Name     Yearofjoining   Address
Robert      1994        64C-WallsStreet
Sam         2000           68D-WallsStreet
John        1999          26D-WallsStreet*/
class Employee{
  String name;
  int Yoj;
  String Address;
  void display(){
  System.out.println(name+" "+Yoj+" "+Address);
  }
}
class EmployeeDetails{
  public static void main(String args[]){
    Employee emp1=new Employee();//default constructor
    emp1.name="Robert";
    emp1.Yoj=1994;
    emp1.Address="64C-WallsStreet";
    emp1.display();
    Employee emp2=new Employee();
    emp2.name="Sam";
    emp2.Yoj=2000;
    emp2.Address="68D-WallsStreet";
    emp2.display();
    Employee emp3=new Employee();
    emp3.name="John";
    emp3.Address="26D-WallsStreet";
    emp3.Yoj=1999;
    emp3.display();
  }
}