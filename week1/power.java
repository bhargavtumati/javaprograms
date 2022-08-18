//Write a java program to find power of a number using for loop.
import java.util.*;
class power{
public static void main(String args[])  {
  Scanner sc=new Scanner(System.in);
  double n,p,i=1;
  System.out.print("enter number: ");
  n=sc.nextDouble();
  System.out.print("enter power: ");
  p=sc.nextDouble();
  while(p>0){
    i*=n;
      p=p-1;
  }
  System.out.print(i);
}
}