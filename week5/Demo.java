//wap to demonstrate throw an Exception using try
import java.util.*;
class Demo{
  public static void main(String args[]){
    try{
      throw new NullPointerException();
    }
    catch(NullPointerException e){
     System.out.println(e); 
    }
    System.out.println("Demo");
  }
}