// Java Program to demonstrate interfaces in Java
// Creating an interface named MyInterface
interface MyInterface
{
   public void method1();
   public void method2();
}
// Implementing MyInterface and defining its methods
class CallInterface implements MyInterface
{
  public void method1() {
      System.out.println("implementation of method1");
  }
  public void method2() {
      System.out.println("implementation of method2");
  }
  public static void main(String arg[]) {
      MyInterface obj = new CallInterface();
      obj. method1();
      obj. method2();
  }
}
/* Objective of this program is to understand interface in java
Let's create an interface say MyInterface and declare two methods. Methods declared in interface are public and abstract by default.
Now let's create a class say CallInterface that implements MyInterface and defining both the methods of the interface
In main method creating the reference of Myinterface interface type holding it's child class object.
Remember abstract classes and interfaces cannot be instantiated but their references can be created.
Calling the methods now.
Note that a class can implement multiple interfaces also and do multiple inheritance.
*/