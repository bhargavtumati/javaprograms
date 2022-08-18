//wap to find mid value of array
import java.util.*;
class midvalue{
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
    System.out.println("enter array length");
    int n=sc.nextInt(),arr[]=new int[n];
    System.out.println("enter array elements");
    for(int i=0;i<n;i++)
    arr[i]=sc.nextInt();
  System.out.println("mid value "+arr[n/2]);
  }
}