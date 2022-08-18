//Write a Java program to remove duplicate elements from an array.
import java.util.*;
class delduplicate{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int n,i,j;
   System.out.println("enter size of array");
    n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("enter the array elements");
    for(i=0;i<n;i++)
      a[i]=sc.nextInt();//reading elements from console
    System.out.println("array without duplicate elements");
    for(i=0;i<n;i++){
      for(j=0;j<i;j++)
        if(a[i]==a[j])
          break;
      if(i==j)
        System.out.println(a[i]);
    } 
  }
}