// Java Program to demonstrate Inheritance
// Parent class
class Vehicle {
  // Declaring & Initializing Vehicle attribute
  String brand = "Tata Motors";  
  // Defining Vehicle method      
  public void honk() {                    
    System.out.println("Tuut, tuut!");
  }
}
// Child class
class Car extends Vehicle {
  // Declaring & Initializing Car attribute
  String model = "Safari";    
  public static void main(String[] args) {

    // Creating a myCar object
    Car myCar = new Car();

    // Calling the honk() method of the Vehicle class on myCar object
    myCar.honk();

    // Displaying the value of the brand attribute from the Vehicle class and the value of the model from the Car class
    System.out.println(myCar.brand + " " + myCar.model);
  }
}
/*
Objective of this program is to understand Inheritance in Java
Here Vehicle is the super or parent class that has an attribute named brand and a method honk()
To inherit Vehicle class we write class Car extends Vehicle and this way Car class becomes the Child of Vehicle.It can access Parent's attributes and methods.
Here honk() method and brand attribute of the Vehicle class and model attribute of Car class are accessed and displayed.
*/