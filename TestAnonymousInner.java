// Java Program to understand Anonymous Inner Class

class Person {
  void eat() {
    System.out.println("Food");
  }
}

public class TestAnonymousInner {
    
 public static void main(String args[]) {
     
  // Anonymous inner class
  Person p=new Person() {
  // Overriding the method
  
  void eat() {
    System.out.println("Tasty Food");
  }
};

  p.eat();
 }
}