/*Create a class with a method that prints "This is parent class" and its subclass with another method that prints "This is child class". Now, create an object for each of the class and call

1 - method of parent class by object of parent class
2 - method of child class by object of child class
3 - method of parent class by object of child class*/
class Parent{
  void displayp(){
    System.out.println("This is parent class");
    
  }
}
class Child extends Parent{
  void displayc(){
    System.out.println("This is child class");
    
  }
}
class inheritancetest{
  public static void main(String args[]){
    Parent obj= new Parent();
    Child obj2= new Child();
    obj.displayp();
    obj2.displayc();
    obj2.displayp();
  }
}