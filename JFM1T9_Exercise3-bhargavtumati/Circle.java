// Java Program to understand this keyword
public class Circle
{
    private double radius;
    // Declaring an argumented constructor
    public Circle(double radius)
    {
        //this must be explicitly used to reference the data field radius of the object/instance
        this.radius=radius;
    }
    public double getArea()
    {
        // calculating area using radius and pi value fetched from java.lang.Math class PI constant
        return this.radius*this.radius*Math.PI;
    }
    public static void main(String args[])
    {
     Circle obj= new Circle(1.0);
     System.out.println(obj.getArea());
    }
}
/* Objective of this java program is to understand the use of 'this' keyword
Here we have an instance variable double radius and a parameterized constructor with the parameter name also radius
Here 'this' is used with the data field radius of the current object/instance
We have a method getArea where let's calculate area using this.radius and pi value fetched from java.lang.Math class PI constant
Coming to main method
Creating object and Passing radius value 1.0 to argumented constructor to initialize radius for the object/instance
Finally printing area in console
*/