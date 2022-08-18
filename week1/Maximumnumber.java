//Write a java program to find maximum between two numbers.
import java.util.*;
public class Maximumnumber{
  public static void main(String[] args){
    int a,b;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter two numbers");
    a=sc.nextInt();
    b=sc.nextInt();
    if(a>b)
      System.out.println("a is great");
    else if(b>a)
      System.out.println("b is great");
    else
      System.out.println("both are equal");
  }
}