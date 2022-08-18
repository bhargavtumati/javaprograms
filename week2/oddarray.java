//Write a java program to print odd indexed element of an array.
import java.util.*;
class oddarray{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    System.out.println("enter size of array");
    int n=s.nextInt();
    int l[]=new int[n];//allocating n cells for array l
    System.out.println("Enter array elements");
    for(int i=0;i<n;i++)
      l[i]=s.nextInt();
    System.out.println("odd indexed array elements are");
    for(int i=1;i<n;i+=2){
      System.out.println(l[i]);
    }
  }
}