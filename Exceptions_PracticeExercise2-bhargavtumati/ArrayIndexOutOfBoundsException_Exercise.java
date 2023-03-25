/* 10. Write a code to take an array and a non-negative integer k as input print the kth element of the array? 
   Write exception handling code for the case in which k is greater than or equal to the size of the array?

  Sample Input: n= 4, arr = [4,1,4,5], k = 1
  Expected Output: 1
  
  Sample Input: n=3, arr= [4,46,4], k=3
  Expected Output: java.lang.ArrayIndexOutOfBoundsException.

*/
import java.util.*;
public class ArrayIndexOutOfBoundsException_Exercise {

    public static void main(String args[]) {
int arr[]={4,46,7,45,5,6};
      System.out.println("enter the index of element");
      Scanner dc=new Scanner(System.in);
      int k=dc.nextInt();
      System.out.println(arr[k]);
    }
}