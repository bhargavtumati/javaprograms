// Java program to demonstrate Abstraction through abstract classes

abstract class Demo1{
		   public void disp1(){
		     System.out.println("Concrete method of abstract class");
		   }
			 // Declaring an abstract method 
		   abstract public void disp2();
		}

		public class AbstractDemo extends Demo1{
		   /* abstract method of Demo1 class defined here
		   It is must if you don't define abstract method of super class
		   compiler would throw an error*/  
		   public void disp2()
		   {
		       System.out.println("I'm overriding abstract method");
		   }
		   public static void main(String args[]){
		       AbstractDemo obj = new AbstractDemo();
		       obj.disp2();
		   }
		}
/* Objective of this program is to understand abstraction and abstract classes.
Let's declare an abstract class and create a concrete method and declare an abstract method.
It’s  more valid to declare a method once in a parent class rather than over and over again in multiple subclasses
Now in child class, It is must to define abstract method of super class else compiler would throw an error*/