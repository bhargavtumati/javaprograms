// Objective of this java program is to perform binary search on a sorted array. Array must be sorted to perform binary search.

class BinarySearchExample {  

 public static void binarySearch(int arr[], int first, int last, int key) {  

  // In binarySearch method first we find out mid element
   int mid = (first + last)/2;  

  //Then we run a loop till first element <= last element
   while( first <= last ){  
      if ( arr[mid] < key ){  
        first = mid + 1;     
      }else if ( arr[mid] == key ){  
        System.out.println("Element is found at index: " + mid);  
        break;  
      }else{  
         last = mid - 1;  
     }  
 
     //Before the next iteration, let's initialize mid = (first + last)/2 again to limit the search 
      mid = (first + last)/2;  
    }  

   //At last we check if ( first > last ) then element is not found.
   if ( first > last ){  
      System.out.println("Element is not found!");  
    }  
  }  
     public static void main(String args[]){  

     //Here we have an array that is already sorted. The int variable key or element to search is suppose 30. 
     //int variable last is initilaized arr.length-1;
     int arr[] = {10,20,30,40,50};  
     int key = 30; 
     //Try changing the key i.e., element to be searched and also run at your end. 
     int last=arr.length-1; 

     //Let's pass these arguments to a binarySearch method that we'll create here. 
     binarySearch(arr,0,last,key);     
     }  
}  
  


