//Write a java program to delete an element from an array at specified position.
import java.util.*;
public class delearray{
  static public void main(String... args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter no of elements");
    int n=sc.nextInt(), a[]=new int[n],i,p,temp[]=new int[n-1];
    System.out.println("enter elements of array");
  for(i=0;i<n;i++)
      a[i]=sc.nextInt();
    System.out.println("enter the position");
    p=sc.nextInt();
    
    for(i=0;i<n-1;i++)
      {
          if(i<p)
temp[i]=a[i];
      else
temp[i]=a[i++];}
    System.out.println("array without duplicate element are:");
      for(i=0;i<n-1;i++){
     System.out.println(temp[i]);
      }
  }
}
  