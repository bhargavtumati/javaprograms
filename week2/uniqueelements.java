// Write a java program to print all unique elements in the array.
import java.util.*;
public class uniqueelements{
  static public void main(String... args){
    System.out.println("enter no of values");
    int n,i,j,count=0;
    Scanner z=new Scanner(System.in);
    n=z.nextInt();
    int arr[]=new int[n];
    System.out.println("enter elements");
    for(i=0;i<n;i++)
    arr[i]=z.nextInt();
    System.out.println("unique elements");
    for(i=0;i<n;i++){
     count=1;
      for(j=i+1;j<n;j++){
        if(arr[i]==arr[j])
count++;
  }
  if(count==1)
    System.out.println(arr[i]);
    }
}
}