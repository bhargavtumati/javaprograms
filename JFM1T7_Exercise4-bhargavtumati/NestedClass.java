// Java program to demonstrate Inner(Nested) Classes

class OuterClass {
  int x = 10;
  
  class InnerClass {
    int y = 5;
  }
}
public class NestedClass {
    
  public static void main(String[] args) {
      
    OuterClass myOuter = new OuterClass();
    OuterClass.InnerClass myInner = myOuter.new InnerClass();
    
    System.out.println(myInner.y + myOuter.x);
  }
}