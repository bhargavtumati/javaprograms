import java.util.ArrayList;
  public class Sample2 {
    public static void main(String[] args){
      ArrayList<Employee>  emp = new ArrayList<Employee>();
Employee obj=new Employee("bhargav",145);
      Employee obj2=new Employee("vishal",745);
      Employee obj3 =new Employee("karunakar",785);
      emp.add(obj);
      emp.add(obj2);
      emp.add(obj3);
      // Create 3 Employee objects and store them in ArrayList
     // Iterate over the ArrayList to print each Employee's details
      for(Employee e:emp)
        e.display();
    }
  }
// Complete the class Employee
class Employee {
String name;
  int id;
 Employee(String name,int id){
    this.name=name;
    this.id=id;}
   void display(){
    System.out.println(name+" "+id);}
  }



