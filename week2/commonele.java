//Write a Java program to find the common elements between two arrays 
import java.util.*;
public class commonele{
  static public void main(String... args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter no of elements");
    int n=sc.nextInt(), a[]=new int[n],i,j,b[]=new int[n];
    System.out.println("enter elements of array a");
  for(i=0;i<n;i++)
      a[i]=sc.nextInt();
    System.out.println("enter elements of array b");
  for(i=0;i<n;i++)
      b[i]=sc.nextInt();
    
    System.out.println("common elements are:");
    for(i=0;i<n;i++)
      {
       for(j=0;j<n;j++)
          {
            if(a[i]==b[j])
         System.out.println(b[j]);
          }
      }
  }
}