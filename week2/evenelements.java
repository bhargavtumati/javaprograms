//Write a java program to print all even elements in an array.
import java.util.*;
class evenelements{
  public static void main(String args[]){
    System.out.println("enter no of array elements");
    Scanner s =new Scanner(System.in);
    int n=s.nextInt(),i;
  int a[]=new int[n];
    System.out.println("enter array elements");
  for(i=0;i<n;i++)
    a[i]=s.nextInt();
    System.out.println("even elements are");
    for(i=0;i<n;i++){
      if(a[i]%2==0)
        System.out.println(a[i]);
    }
  }
}