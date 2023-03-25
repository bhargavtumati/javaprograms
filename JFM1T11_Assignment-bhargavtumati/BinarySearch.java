/* JFM1T11_Assignment2:

   Write a program to execute the search of a number in a sorted array following the below logic: 
   If the target element is greater than middle element then you go to the middle of the right of the remaining numbers 
   or otherwise towards middle of the left of the remaining numbers. 
   Continue until the number is either found or not found.
   Prompt the user input from the terminal.
   
   Sample Input: 2,5,10,12,15,20,25,31,40
   Enter number to search x= 20

   Expected Output: Position of element is : 6
   
   Enter number to search x= 26
   Expected Output: Sorry,Key doesn't exist in the array
   
*/
import java.util.Scanner;
public class BinarySearch {
//main method 
public static void main(String args[]){
//Declare variables
int a[]=new int [5],i,n=a.length,temp,j;
//take input from user
Scanner s=new Scanner (System.in);
  System.out.println("enter 5 array elements");
  for(i=0;i<5;i++){
    a[i]=s.nextInt();
  }
  for(i=0;i<n;i++){
    for(j=i+1;j<n;j++){
      if(a[i]>a[j]){
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
      }
    }
  }
  System.out.println("enter key word");
  int key=s.nextInt();
//call binarySearch method
  binarySearch(a,key);
}
//create a method in that declare a variables and initialize l=a.length, beg=0, end=l-1, mid=(beg+end)/2
public static void binarySearch(int a[],int key){
//check each number less than or greater than to the mid element
int l=a.length,beg=0,end=l-1,mid=(beg+end)/2;
//if mid element is less than key than it calculates beg and mid
while(beg<=end){
  //if mid is equal to key than it stops and return mid
  if(key==a[mid]){
    System.out.println(key +" found at index "+mid);
    break;
  }
    //if mid element is greater than key then it calculates end and mid
  else if(key>a[mid]){
    beg=mid+1;
  }
  else if(key<a[mid]){
    end=mid-1;
  }
  mid=(beg+end)/2;
}
//checking beg is greater than end, then mid = 0
if(beg>end){
  System.out.println(key +" not found");
}
}
}