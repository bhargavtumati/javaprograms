/* JFM1T10_Assignment3:

     Create an abstract class Shape with following data member and methods- 
     Create data members for height and width.
     Add getter and setter methods for height and width.
     Create methods for finding area and perimeter.
     Create three subclasses Square, Rectangle and EquilateralTriangle that extends Shape class and define both the methods.
     Write a program that will find the area and perimeter of 3 Shapes and print the details for all. 
     Prompt the user for the  values to be input from the terminal.
 
     Sample Input:
     Enter Width of Rectangle in meters
     10
     Enter Length of Rectangle in meters
     5
     Enter width of Equilateraltriangle
     15
     Enter radius of circle
     60

     Expected Output:
     Rectangle width: 10.0 meters and length: 5.0 meters
     Resulting area: 50.0 square meters
     Resulting perimeter: 30.0 meters 

     EquiTriangle side: 15.0meters
     Resulting area: 97 square meters
     Resulting perimeter: 45.0 meters 

     Circle radius : 60.0meters
     Resulting area: 11310 square meters
     Resulting perimeter: 377 meters  

*/

import java.util.Scanner;

abstract class Shape{
double height;
  double width;
public void setValues(double height, double width)
   {
      this.height = height;
      this.width = width;
   }
   public double getHeight() 
   {
       return height;
   }
   public double getWidth() 
   {
       return width;
   }
   public abstract double getArea();
  public abstract double getPerimeter();
}
class Square extends Shape{
   public double getArea()
    {
        return getHeight() * getWidth();
}
  public double getPerimeter()
    {
        return 4 * getWidth();
}
  }
//Add Square class that extends Shape class
class Rectangle extends Shape{
  public double getArea()
    {
        return getHeight() * getWidth();
    }
  public double getPerimeter()
    {
        return 2*(getHeight()+getWidth());
  }
}
//Add Rectangle class that extends Shape class
class EquilateralTriangle extends Shape{
 public double getArea() 
    {
    return (1.73*getWidth()*getWidth())/4;
    }
  public double getPerimeter()
    {
        return 3*(getWidth());


  }
//Add EquilateralTriangle class that extends Shape class
}
class AreaPerimeter {
public static void main(String... args){
//Add the main method here and find Area and Perimeter 
Scanner sc=new Scanner(System.in);
//Use the scanner class to provide height and width at execution time
  

  System.out.println("enter the length of side of square ");
  int a=sc.nextInt();
  System.out.println("enter the length of rectangle");
  int b=sc.nextInt();
  System.out.println("enter the breadth of rectangle");
  int c=sc.nextInt();
  System.out.println("enter the length of side of Equilateral triangle");
  int d=sc.nextInt();
  
/*
Scanner s= new Scanner(System.in);
System.out.println("Enter the height of triangle");
EquilateralTriangle triangle=new EquilateralTriangle();
triangle.setHeight(s.nextInt());
*/
   Square sh = new Square();
        sh.setValues(d, d);
        System.out.println("Square length: "+sh.getHeight()+" meters "+
     "\nResulting area: "+sh.getArea()+" square meters"
     +"\nResulting perimeter: "+sh.getPerimeter()+ " meters");
        Rectangle re = new Rectangle();
        re.setValues(a, b);
        System.out.println("\nRectangle breadth: "+re.getHeight()+" meters " +"and length:"+re.getWidth()+" meters"+
     "\nResulting area: "+re.getArea()+" square meters"
     +"\nResulting perimeter: "+re.getPerimeter()+ " meters");
        EquilateralTriangle tr = new EquilateralTriangle();
        tr.setValues(c,c);
        System.out.println("\nTriangle side: "+tr.getHeight()+" meters" +
     "\nResulting area: "+tr.getArea()+" square meters"
     +"\nResulting perimeter: "+tr.getPerimeter()+ " meters");
}
}