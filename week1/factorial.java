//Write a java program to calculate factorial of a number.
import java.util.*;
public class factorial{
  public static void main(String ar[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number: ");
    long n,i=1;
    n=sc.nextLong();
    while(n>0)
      {
        i=i*n;
        n=(n-1);
      }
    System.out.println(i);
  }
}