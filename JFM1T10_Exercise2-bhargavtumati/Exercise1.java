//Write an abstract class Bike that contains only one abstract method run. Its implementation is provided by the Honda class.
abstract class Bike{
  abstract public void disp();
}
class Honda{
  void disp(){
    System.out.println("Honda");
  }
}


class Exercise1 {
  public static void main(String[] args) {
    Honda h=new Honda();
    h.disp();
    
    
  }
}