//wap to demonstrate try and more than 1 catch block
import java.util.*;
class Excep3{
  public static void main(String args[]){
    System.out.println("enter any two numbers");
    Scanner sc=new Scanner (System.in);
    
    int x=sc.nextInt();
    int y=sc.nextInt();
    int p[]={7,86,4};
    
    try{
      System.out.println(p[10]);
    System.out.println(x/y);
    }
      catch(ArithmeticException a){
      System.out.println(a);
    }
    catch(ArrayIndexOutOfBoundsException a){
      System.out.println(a);}
      
      catch(Exception a){
      System.out.println(a);
    }
  }
}