// Java Program to demonstrate Bike class, its member variables and objects.
public class Bike {
    
// Class member variables declaration
  String model;
  String color;
  
  public static void main(String[] args) {
    
      // Creating first object called "myFirstBike" and assigning the value to it's attributes- model and         color
      Bike myFirstBike = new Bike();
      myFirstBike.model="Pulsar";
      myFirstBike.color="Red";
      
      // Creating second object called "myNewBike" and assigning the value to model and color
      Bike myNewBike = new Bike();
      myNewBike.model="Dominar";
      myNewBike.color="Blue";
      
      // Printing the value of attributes for myFirstBike
      System.out.print("FirstBike:");
      System.out.println(myFirstBike.model+" "+myFirstBike.color);
      
      // Printing the value of attributes for myNewBike
      System.out.print("NewBike:");
      System.out.println(myNewBike.model+" "+myNewBike.color);
  }
}

/* Objective of this java program is to demonstrate a Bike class, its member variables and creating objects 
Here are two member variables model and color
Creating first object called "myFirstBike" and assigning the value to it's attributes- model and color
Similarly second object called "myNewBike" and assigning the value to it's attributes model and color
Now let's print the value of attributes model and color for both the objects myFirstBike and then myNewBike
Note that You can also create objects of a class and access it in another class for better organization of classes
*/
