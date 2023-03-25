// Objective of this java program is to sort an array using insertion sort algorithm.

class InsertionSort 
{ 
    /*Function to sort array using insertion sort*/
    void sort(int arr[]) 
    { 
        int n = arr.length; 
        //In our sort method let's run a loop from 0th index till n that is length of the array.
        for (int i=1; i<n; ++i) 
        { 
            int key = arr[i]; 
        //Let's take a key as current element and j as i-1
            int j = i-1; 
  
            /* Move elements of arr[0..i-1], that are greater than key, to one position ahead of their 
               current position for that we run a loop and assign arr[j+1] = arr[j]; and decrement j  
             */
            while (j>=0 && arr[j] > key) 
            { 
                arr[j+1] = arr[j]; 
                j = j-1; 
            } 
      //Before the next iteration of main outer loop, we assign value of key to arr[j+1]
            arr[j+1] = key; 
        } 
    } 
  
     //A utility function to print array of size n.
    // We have a separate method to print the values of sorted array.
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
  
        System.out.println(); 
    } 
  
    // Driver method 
    public static void main(String args[]) 
    {         
        //We have an unsorted array of int values. Let's pass this array as an argument to a sort method created here.
        int arr[] = {12, 11, 13, 5, 6}; 
  
        InsertionSort ob = new InsertionSort();         
        ob.sort(arr); 
          
        printArray(arr); 
    } 
}
