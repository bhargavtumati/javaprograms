// Java Program to demonstrate for-each loop on Array

class ForEachArray {
    
	public static void main(String args[]) {
	    
		//Declaring an Array
		int arr[];
		
		// Creating an Array
		arr=new int[3];
		
		//Initializing Array elements
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		
		// Traversing Array with for-each loop
		for (int var : arr) {     
		  
		  System.out.println(var);
		    
		}
	}
}