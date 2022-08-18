//Write a Java program to insert an element (specific position) into an array
import java.util.*;
class insert{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of array");
    int n=sc.nextInt(),i;
    int arr[]=new int[n+1];
    System.out.println("enter the array elements");
    for(i=0;i<n;i++)
      arr[i]=sc.nextInt();
    System.out.println("Enter specific index");
    int index=sc.nextInt();
    System.out.println("enter your element");
    int ele=sc.nextInt();
    for(i=n;i>index;i--)
      arr[i]=arr[i-1];
    arr[index]=ele;
    n++;
    System.out.println("new array");
    for(i=0;i<n;i++)
      System.out.print(arr[i]+" ");
  }
}