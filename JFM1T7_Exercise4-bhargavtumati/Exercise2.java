// Write a program to demonstrate accessing a static inner class
class Exercise2 {
int x=5;
  static class Inner{
    int y =5;
  }
public static void main(String[] args){
Exercise2.Inner myinner = new Exercise2.Inner();
  System.out.println(myinner.y);
}
}

