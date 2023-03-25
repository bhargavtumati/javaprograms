// Java Program to demonstrate Compile time polymorphism through Method Overloading
class DemoOverload {
    void demo (int a) {
	    System.out.println ("a: " + a);
	}
    // Overloading the method demo with two int parameters
    void demo(int a, int b) {
        System.out.println ("a and b: " + a + "," + b);
    }
    // Overloading the method demo with a double type parameter
	double demo(double a) {
	       System.out.println("double a: " + a);
	       return a*a;
	}
}
class CallOverload {
    public static void main (String args []) {
	    DemoOverload obj = new DemoOverload();
	    double result;
	    obj.demo(10);
	    obj.demo(10,20);
	    result = obj .demo(5.5);
	    System.out.println("Returned Output : " + result);   
	    }
	}
/*Objective of this program is to understand Compile time polymorphism through Method Overloading
Here we have a method demo with one parameter of int type
Let's create a overloaded method demo with different parameters say two parameters int a and int b to perform differents tasks/operations.
Similarly Overloading the method demo with a double type parameter. In method overloading, name of the methods is same but their parameters list is different and return type may vary.
CallOverload is the main class here that is calling overloaded method demo
*/