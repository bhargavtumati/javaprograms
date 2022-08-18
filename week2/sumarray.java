//Write a java program to print sum of elements in an array.
import java.util.*;
class sumarray{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    System.out.println("enter size of array");
    int n=s.nextInt(),sum=0;
    int l[]=new int[n];//allocating n cells for array l
    System.out.println("Enter array elements");
    for(int i=0;i<n;i++)
      l[i]=s.nextInt();
    for(int i=0;i<n;i++)
      sum+=l[i];
    System.out.println("sum of array elements is "+sum);
  }
}