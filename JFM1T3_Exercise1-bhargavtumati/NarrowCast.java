// Java Program to demonstrate the concept of Narrowing Type-casting

class NarrowCast {
    
	public static void main(String args[])
	{
		// Initializing variables radius and pie
		int radius=3;
		float pie=3.14f;
		
		//Calculating the area of the circle
		float area=2*pie*radius;
		
		// Printing the floating point area value
		System.out.println("Area of circle = "+ area);
		
		// Casting the floating point area value to int
		int newarea=(int)area;
	
		// Printing the casted area value from float to int 
		System.out.println("Area of circle = "+ newarea);
	}

}