// Complete and execute java program for Inner(Nested) Classes
class OuterClass {
  int x = 100;
  class InnerClass {
    int y = 50;
  }
}
public class Sample1 {
  public static void main(String[] args) {
    //Create OuterClass object
    OuterClass myouter = new OuterClass();
    //Create InnerClass object
    OuterClass.InnerClass myinner =myouter.new InnerClass();
    //Access/print both the variables of OuterClass and InnerClass
    System.out.println(myouter.x+" "+myinner.y);
  }
}