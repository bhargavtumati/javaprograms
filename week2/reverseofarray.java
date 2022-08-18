//Write a java program to reverse the array elements. 
import java.util.*;
class reverseofarray{
static public void main(String... z){
Scanner m=new Scanner(System.in);
  System.out.println("enter size of array");
  int n=m.nextInt();
int arr[]=new int[n],i,j,t;//allocating memory for array arr with n number of elements
  System.out.println("enter elements");
  for(i=0;i<n;i++)
      arr[i]=m.nextInt();
  for(i=0;i<n/2;i++)
    {
      t=arr[i];
      arr[i]=arr[n-1-i];
      arr[n-1-i]=t;
    }
  System.out.println("reverse of array");
  for(i=0;i<n;i++)
    System.out.println(arr[i]);
  
}
}