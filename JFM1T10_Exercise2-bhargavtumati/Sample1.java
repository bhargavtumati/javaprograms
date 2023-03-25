//Complete and execute this java program of abstract class named Shape and it's child classes

abstract class Shape {
  abstract void area();
}

class Circle extends Shape {
void area(){
  int radius=9;
  System.out.println("area of circle: " +(radius*radius*Math.PI));
}

}
class Rectangle extends Shape {
void area(){
  int length=5;
  int breadth=6;
  System.out.println("area of rectangle: "+(length*breadth));
}

}
class Triangle extends Shape {
void area(){
  double height=5.0;
  double base=4.0;
  System.out.println("area of triangle: "+(0.5*height*base));
}

}

class Sample1 {
  public static void main(String[] args) {
    // access all child classes method here one by one
    Circle obj1 =new Circle();
    obj1.area();
    Rectangle obj2=new Rectangle();
    obj2.area();
    Triangle obj3=new Triangle();
    obj3.area();
    
    
  }
}