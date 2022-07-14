//Complete and execute java program to understand static inner class
class OuterClass {
  int x = 100;

  static class InnerClass {
    int y = 50;
  }
}

public class Sample2 {
  public static void main(String[] args) {
   // Access/print inner class variable y 
  OuterClass.InnerClass myinner= new OuterClass.InnerClass();
    System.out.println(myinner.y);
  }
}
