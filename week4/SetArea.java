//Write a program to print the area of a rectangle by creating a class named 'Area' having two methods. First method named as 'setDim' takes length and breadth of rectangle as parameters and the second method named as 'getArea' returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.
import java.util.*;
class Area2{
  int length;
  int breadth;
  void setDim(int l,int b){
length=l;    
  breadth=b;}
  void getArea(){
    int area=length*breadth;
    System.out.println("area of rectangle: "+area);
  }
}
  class SetArea{
  public static void main(String args[]){
    Area2 obj=new Area2();
    Scanner s=new Scanner(System.in);
    System.out.println("enter length and breadth");
    int l=s.nextInt();
    int b=s.nextInt();
    obj.setDim(l,b);
    obj.getArea();
  }
  }
