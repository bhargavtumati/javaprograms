// Java Program to demonstrate Run-time Polymorphism through Method Overriding

	 class BaseClass {
	    //Base class method
	    public void methodToOverride() {
	         System.out.println ("I'm the method of BaseClass");
	    }
	}
	class DerivedClass extends BaseClass {
	    //Derived Class method
	    public void methodToOverride() {
	         System.out.println ("I'm the method of DerivedClass");
	    }
	}

	public class CallOverriding
	{
	     public static void main (String args []) {
	        // BaseClass reference and object
	        BaseClass obj1 = new BaseClass(); 
	        // BaseClass reference but DerivedClass object
	        BaseClass obj2 = new DerivedClass(); 
		   // DerivedClass reference and DerivedClass object
		   DerivedClass obj3 = new DerivedClass();
	        // Calls the method from BaseClass class
	        obj1.methodToOverride(); 
	        //Calls the method from DerivedClass class
	        obj2.methodToOverride(); 
		   //Calls the method from DerivedClass class
	        obj3.methodToOverride(); 
	     }
	}
/* Objective of this program is to understand Run time Polymorphism or Method Overriding
Here DerivedClass is overriding the Base class method named methodToOverride with same defintion/parameters but ofcourse for a different task to do.
CallOverriding is the main class here that calls the overridden method using 3 approaches-
1. Using BaseClass reference and object that calls the method from BaseClass class
2. Using BaseClass reference but DerivedClass object that calls the method from DerivedClass class
3. Using DerivedClass reference and DerivedClass object that calls the method from DerivedClass class
*/


