//Write a java program to print all elements in an char array.
import java.util.*;
class chararray{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    System.out.println("enter size of array");
    int n=s.nextInt();
    char l[]=new char[n];//allocating n cells for array l
    System.out.println("Enter array elements");
    for(int i=0;i<n;i++)
      l[i]=s.next().charAt(0);
    System.out.println("array elements are");
    for(int i=0;i<n;i++)
      System.out.println(l[i]);
  }
}