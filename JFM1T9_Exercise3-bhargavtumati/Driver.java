// Java Program to illustrate different uses of super keyword

// Base class Vehicle 
class Vehicle { 
    int maxSpeed;
    public Vehicle() {
        maxSpeed=110;
    }
} 
  
// Sub class Car extending Vehicle 
class Car extends Vehicle { 
    int maxSpeed;
    public Car() {
        maxSpeed = 160;
    } 
    void display() { 
        //Printing maxSpeed of base class i.e., Vehicle
        System.out.println("Maximum Speed: " + super.maxSpeed); 
    } 
} 
  
// Driver program to test 
class Driver { 
    public static void main(String[] args) { 
        // Creating Car class object will initialize both Vehicle and Car instance variables on object              hatchback
        // super does Constructor chaining and initializes first base class instance variables, then sub            class instance variables
        Car hatchback = new Car(); 
        hatchback.display(); 
    } 
}
/*
Objective of this Program is to understand all the uses of super keyword
Here we have parent class called Vehicle with a variable maxSpeed and a constructor initializing it.
Let's have a class Car that extends Vehicle doing single inheritance here. class Car also have the same variable maxSpeed. Now what if parent class variable maxSpeed is required to be accessed here in child class? if we print maxSpeed,obviously it'll refer to its own member variable, so we can write super.maxSpeed to refer to parent class member variable here in child class.  
Coming to main class-
Creating Car class object will initialize both Vehicle and Car instance variables for object hatchback
super does Constructor chaining and initializes first base class instance variables, then sub class instance variables
Finally invoking display() method of Car class. display() method is accessing maxSpeed from Vehicle class using super
Output here is Maximum Speed: 110
*/