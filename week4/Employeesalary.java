/*Create a class named 'Member' having the following members:
Data members
1 - Name
2 - Age
3 - Phone number
4 - Address
5 - Salary
It also has a method named 'printSalary' which prints the salary of the members.

Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' classes have data members 'specialization' and 'department' respectively. Now, assign name, age, phone number, address and salary to an employee and a manager by making an object of both of these classes and print the same.*/
class Member{
  String name;
  int age;
  long phonenumber;
  String address;
  double salary;
  void printsalary(){
    System.out.println(salary);
  }
}
class Employee2 extends Member{
  String specialization;
}
  class Manager extends Member{
    String department;
  }
class Employeesalary{
  public static void main(String args[]){
    Employee2 obj=new Employee2();
    obj.name="suresh";
    obj.age=25;
    obj.phonenumber=9451646154l;
    obj.salary=40000;
    obj.specialization="commerce";
    System.out.println("details of employee: "+obj.name+ " "+obj.age+" "+obj.phonenumber+" "+obj.specialization);
 obj.printsalary();
    Manager obj2 =new Manager();
    obj2.name="ramesh";
    obj2.age=45;
    obj2.phonenumber=6457458415l;
    obj2.salary=65000;
    obj2.department="loans";
    System.out.println("details of manager: "+obj2.name+" "+obj2.age+" "+obj2.phonenumber+" "+obj2.department);
    obj2.printsalary();
  }
}