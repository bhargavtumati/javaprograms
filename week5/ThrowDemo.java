//wap to demonstrate throw exception using if
import java.util.*;
class ThrowDemo{
  public static void main(String args[]){
    int x=10,y=2;
    if(x%y==0)
      throw new NullPointerException();
    System.out.println("Demo");
  }
}