//Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively by creating a class named 'Rectangle' with a method named 'Area' which returns the area and length and breadth passed as parameters to its constructor.
class Rectangle{
  int length;
  int breadth;
  Rectangle(int a,int b){
    length=a;
    breadth=b;
  }
  void Area(){
    System.out.println("length: "+length+"\nbreadth: "+breadth);
    int area=length*breadth;
    System.out.println("Area of Rectangle: "+area);
  }
  public static void main(String args[]){
  Rectangle obj=new Rectangle(4,5);
  obj.Area();
  
  Rectangle obj2=new Rectangle(5,8);
  obj2.Area();
}
}