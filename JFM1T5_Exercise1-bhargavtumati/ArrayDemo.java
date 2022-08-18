//Java program to demonstrate Single Dimensional Array in Java

public class ArrayDemo {
	// Array in method arguments can be denoted by 3 dots also
	public static void main(String ...v)
	{	
	// Declaring and Creating an Array of length 7
	//int arr[]=new int[7];
	// Declaring and Initializing an Array. It initializes the length with number of elements i.e., 7 
	int arr[]= {1,2,3,4,5,6,7};
	
	// Looping down the array
	for(int i=0;i<arr.length;i++)
	{
	// Printing tlhe Array elements
	System.out.println(arr[i]);
	}
  }
}
