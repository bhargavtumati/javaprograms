/* 2. Write a program to illustrate garbage collection by assigning one object to another object. 
      Override finalize() method to display user defined messages.*/

class Employee {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collector in action! Deleted one object!");
    }
    String name;
    int eid;
    Employee(String name,int eid) {
    // assign local variable values to instance variables
       this.name=name;
      this.eid=eid;

    }
}
public class GarbageCollection_Sample {
    public static void main(String[] args) {
         // create two objects for Employee class along with name and eid
        Employee e=new Employee("bhargav",101);
      Employee p=new Employee("shekar",102);
      
e=p;
        // assign emp2 object to emp1          
 System.gc();
        //  call gc() method
        
    }
}
