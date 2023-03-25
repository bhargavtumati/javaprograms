/* JFM1T10_Assignment1:

   Write a program to demonstrate Constructor chaining in Java 
   Add atleast 3 constructors

   Sample Output:
   Parent class default constructor
   Child class default constructor
   Parent class one-argument constructor
   Child class one-argument constructor

*/

class ParentClass{
  ParentClass(){
    System.out.println("Parent class default constructor");
  }
  ParentClass(int a){
    System.out.println("Parent class one-argument constructor");
  }
}
class ChildClass extends ParentClass{
  ChildClass(){
    System.out.println("Child class default constructor");
  }
  ChildClass(int a){
    super(a);
    System.out.println("Child class one-argument constructor");
  }
}
class ConstructorChaining {
public static void main(String args[]){
  ChildClass obj =new ChildClass();
  ChildClass obj1=new ChildClass(2);
}
}