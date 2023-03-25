/* 1. Write a program to illustrate garbage collection by assigning null values to reference variables. 
      override finalize() method to display user defined messages.   */

class Student {
       /* Override finalize() method to print user defined message, 
           throw Throwable class from method signature.*/
        @Override
        protected void finalize() throws Throwable {
            System.out.println("Garbage collector in action! Deleted one object!");
        }
       // declare name variable
       String name;
       // create Student class constructor and pass name as argument
       Student(String name) {
              this.name=name;
        }
}
public class GarbageCollection_Example {
    public static void main(String[ ] args) {
        // create two objects for Student class
        Student std1 = new Student("Praveen");
        Student std2 = new Student("Satish");
        // Assign null values to sd1 and std2        
        std1=null;
        std2=null;
        // call gc() method.        
        System.gc(); 
    }
}
