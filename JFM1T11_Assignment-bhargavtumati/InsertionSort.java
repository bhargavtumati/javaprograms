/* JFM1T11_Assignment3:

   Have you ever arranged the deck of cards, or maybe shirts in your cupboard? What is common between those two things? 
   Well, you put the next card or shirt into their proper position, or we can say you insert the next element in its 
   proper position. Write a program to sort an unsorted array of numbers in the same manner.
   Prompt the user input from the terminal.

   SampleInput: 6,5,4,3,2,1
   
   Expected Output: 1,2,3,4,5,6

*/
import java.util.Scanner;
public class InsertionSort {
public static void main(String args[]){
//main method
Scanner sc=new Scanner(System.in);
  System.out.println("enter size of array");
  int n=sc.nextInt();
  System.out.println("enter array elements");
  int a[]=new int[n],i;
//take input from user
for(i=0;i<n;i++){
   a[i]=sc.nextInt();
  }
//create integer array for all elements
insertionSort(a,n);

//call sort method
  System.out.println("sorted array: ");
  for(i=0;i<n;i++)
System.out.print(a[i]+" ");
//print sorted array
}
static void  insertionSort(int a[],int n){
//create sort method
int i,j,key;
//declare variables
 for(i=1;i<n;i++){
          key=a[i];
          j=i-1;        
// storing current element whose left side is checked for its correct position 
while(j>=0&&a[j]>key){
//check whether the adjacent element in left side is greater or less than the current element.
       a[j+1]=a[j];
         j=j-1; 
       }
// move the left side element to one position forward.
a[j+1]=key;}
 // move current element to its  correct position.
}
}

