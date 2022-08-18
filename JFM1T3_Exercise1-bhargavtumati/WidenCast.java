// Java Program to demonstrate Widening/Automatic Type-casting

public class WidenCast {
    
  public static void main(String[] args) {
      
	// Variable Declaration & Initialization
    int myIntvar = 9;
    
  // Widening/Automatic casting: int to double
    double myDoublevar = myIntvar; 
    
	// Printing the original value of myIntvar
    System.out.println(myIntvar);      // Outputs 9

	// Printing the casted value
    System.out.println(myDoublevar);   // Outputs 9.0
  }
}
