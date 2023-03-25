//Complete and execute this java program to practice 'this' keyword
class Area {

  // fields to calculate area
  private int length;
  private int breadth;

  // method to intialize length and breadth and calculate area
  public void getArea(int length, int breadth) {
    this.length=length;
    this.breadth=breadth;
    int Area=this.length*this.breadth;
    System.out.println("area of triangle "+Area);
  }
}

class Sample1 {
  public static void main(String[] args) {
    // create object of Area
    Area rectangle = new Area();
    // call method
    rectangle.getArea(5,6);
    
  }
}