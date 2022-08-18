/*Write a program to print the area of a rectangle by creating a class named 'Area' taking the values of its length and breadth as parameters of its constructor and having a method named 'returnArea' which returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.*/
import java.util.*;  
class Area{
    int length,breadth,area;
    Area(int l,int b){
      length=l;
      breadth=b;
    }
    int returnArea(){
      area=length*breadth;
      return area;
    }
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    
    System.out.println("enter length");
    int l=s.nextInt();
    System.out.println("enter breadth");
    int b=s.nextInt();
    Area obj=new Area(l,b);
    System.out.println("area of rectangle "+obj.returnArea());
  }
}