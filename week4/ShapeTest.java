//Create a class named 'Shape' with a method to print "This is This is shape". Then create two other classes named 'Rectangle', 'Circle' inheriting the Shape class, both having a method to print "This is rectangular shape" and "This is circular shape" respectively. Create a subclass 'Square' of 'Rectangle' having a method to print "Square is a rectangle". Now call the method of 'Shape' and 'Rectangle' class by the object of 'Square' class.
class Shape{
  void displays(){
  System.out.println("This is Shape");}
}
class Rectangle1 extends Shape{
  void displayre(){
    System.out.println("This is rectangle shape");
  }
}
class Circle extends Shape{
  void displayci(){
    System.out.println("This is circular shape");
  }
}
class Square1 extends Rectangle1{
  void displaysq(){
    System.out.println("Square is a rectangle");
  }
}
class ShapeTest{
  public static void main(String args[]){
    Square1 n=new Square1();
    n.displays();
    n.displayre();
  }
}