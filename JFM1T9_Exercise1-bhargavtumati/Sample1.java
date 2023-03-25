//Complete and execute this java program to check Encapsulation

class Area {

  // fields to calculate area
  private int length;
  private int breadth;

  // constructor to initialize values
public Area(int r,int n){
  length=r;
  breadth=n;
  }

  // method to calculate area
  public void getArea() {
    int Area= length*breadth;
    System.out.println("area of rectangle "+Area);
  }
}

class Sample1 {
  public static void main(String[] args) {
    // create object of Area
    Area rectangle = new Area(9,6);
    rectangle.getArea();
  }
}