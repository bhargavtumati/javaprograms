//Java program to demonstrate Nested Loops in Java for printing a Pattern.

public class Pattern1 {
    
   public static void main( String arg[])
	  {
		// Declaring loop variables
	     int i , k ;
		// Outer loop for rows 
	    for(i = 1 ; i<=5 ; i++)
	    {  
	    // Inner loop for columns
	    	for(k = 1 ; k<=i ; k++)
		   { 
	    		System.out.print(k);
		   }
		// changing line at the end of each row to show the correct pattern
	    System.out.println();
	    }
	  }
	}