//Java program to understand static inner class

class OuterClass
{
  int x = 10;

  static class InnerClass 
  {
    int y = 5;
  }
}

public class StaticInnerDemo
{
  public static void main(String[] args) 
  {
    OuterClass.InnerClass myInner = new OuterClass.InnerClass();
    System.out.println(myInner.y);
  }
}