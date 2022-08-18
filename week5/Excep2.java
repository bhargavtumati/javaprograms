//wap to demonstrate try and catch
import java.util.*;
class Excep2{
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
    catch(Exception e){
      System.out.println(e);
    }
    
  }
}