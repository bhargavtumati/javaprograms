//wap to demonstrate try, catch, finally
import java.util.*;
class ExceptionHandling{
  public static void main(String args[]){
    System.out.println("enter any two numbers");
    Scanner sc=new Scanner (System.in);
    
    int x=sc.nextInt();
    int y=sc.nextInt();
    int p[]={7,86,4};
    
    try{
    System.out.println(x/y);
    }
    catch(Exception a){
      System.out.println("y value will never be zero");
    }
    finally{
    System.out.println(++x);
    System.out.println(--y);}
  }
}