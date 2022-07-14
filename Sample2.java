/*Complete and execute java program to print the following pattern-
54321
5432
543
54
5
*/
public class Sample2 {
    
	public static void main( String arg[]) { 
		// Declaring loop variables
		int i , j ;
		// Outer loop for rows 
		for(i=1;i<=5;i++){//Initialization;condition;increment/decrement) { 
			// Inner loop for columns
	    		for(j=5;j>=i;j--){//Initialization;condition;increment/decrement) { 
	    			//Write print statement here
            System.out.print(j);
	      		}
			// changing line at the end of each row to show the correct pattern
	    		System.out.println();
		}
	}
}