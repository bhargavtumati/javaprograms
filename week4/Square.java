//create a class named 'Rectangle' with two data members 'length' and 'breadth' and two methods to print the area and perimeter of the rectangle respectively. Its constructor having parameters for length and breadth is used to initialize length and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' class with its constructor having a parameter for its side (suppose s) calling the constructor of its parent class as 'super(s,s)'. Print the area and perimeter of a rectangle and a square.
class Rectangle2{
  int length;
  int breadth;
  Rectangle2(int a,int b){
    length=a;
    breadth=b;
  }
  void area(){
    int area=length*breadth;
    System.out.println("area of rectangle: "+area);
  }
  void perimeter(){
    int perimeter=2*(length+breadth);
    System.out.println("perimeter of rectangle"+perimeter);
    
  }
}
class Square extends Rectangle2{
Square(int s){
  super(s,s);
}
public static void main(String args[]){
 Square obj=new Square(4);
  Rectangle2 obj1=new Rectangle2(5,7);
  obj.area();
  obj.perimeter();
  obj1.area();
  obj1.perimeter();
}
}
