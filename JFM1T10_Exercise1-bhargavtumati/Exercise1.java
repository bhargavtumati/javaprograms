//Write a class having overloaded methods named area to calculate and display area of a circle, rectangle and triangle respectively
class Shape {
  double Area(int radius){
  return (radius*radius*Math.PI);}

  int Area(int length, int breadth){
    return (length*breadth);
  }
  double Area(double height, double base){
    return (0.5*height*base);
  }


}

class Exercise1 {
  public static void main(String[] args) {
    Shape obj=new Shape();
    System.out.println("area of circle "+obj.Area(9));
    System.out.println("area of rectangle "+obj.Area(5,4));
    System.out.println("area of tiangle "+obj.Area(5.5,4.5));
    
  }
}