//Write a java program to find sum of all even numbers between 1 to n.
import java.util.*;
class sumeven{
  public static void main(String ar[]){
    int n,s=0,i=2;
    Scanner d=new Scanner(System.in);
System.out.println("Enter n value");
    n=d.nextInt();
    for(;i<=n;i+=2)
      s=s+i;
    System.out.println("sum of first n even nos "+s);
  }
}