//Write a java program to find sum of all natural numbers between 1 to n.
import java.util.*;
class sumn{
  public static void main(String ar[]){
    int n,s=0,i=1;
    Scanner d=new Scanner(System.in);
System.out.println("Enter n value");
    n=d.nextInt();
    for(;i<=n;i++)
      s=s+i;
    System.out.println("sum of first n numbers "+s);
  }
}