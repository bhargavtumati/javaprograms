// Java Program to demonstrate Constructors

public class ConstructorDemo {
  // Create a class attribute
  int x;  

  // Create a constructor for the ConstructorDemo class
  public ConstructorDemo() {
    // Set the initial value for the class attribute x
    x = 5;  
  }

  public static void main(String[] args)
  {
    // Create an object of class ConstructorDemo (This will call the constructor)
    ConstructorDemo myObj = new ConstructorDemo(); 
    // Print the value of x
    System.out.println("x = "+myObj.x); 
  }
}
