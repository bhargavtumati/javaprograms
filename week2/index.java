//find index of a given element of array
import java.util.*;
public class index{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
  System.out.println("Enter size of array");
  int n=sc.nextInt(),arr[]=new int[n],i;
  System.out.println("enter array elements");
  for(i=0;i<n;i++)
    arr[i]=sc.nextInt();
  System.out.println("enter array element");
  int t=sc.nextInt();
  for(i=0;i<n;i++)
    {
      if(arr[i]==t)
        System.out.println("index number of element is "+i);
    }
  }  
}
