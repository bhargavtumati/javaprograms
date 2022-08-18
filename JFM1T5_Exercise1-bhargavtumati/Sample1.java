// Complete and execute java Program for finding smallest/minimum element in a single dimensional array
import java.util.*;
class Sample1 {

	public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
		//Initialize array  
        	int[] arr = new int[5];
    System.out.println("Enter elements");
    for(int i=0;i<=4;i++){
      arr[i]=sc.nextInt();
    }

        	//Initialize min with first element of array.  
        	int min = arr[0];  

        	//Loop through the array  
        	for(int i=0;i<=arr.length-1;i++) {//Intialization;Condition;Increment) {  

            	//Compare elements of array with min  
           	if(arr[i]<=min){//Test Condition)  
               	//Write code to store in min if array element is less than it.   
       min=arr[i];
            }  
          }
     System.out.println("Smallest element present in given array: " + min); 
   }
}
