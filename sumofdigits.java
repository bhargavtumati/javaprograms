//Write a java program to calculate sum of digits of a number.
import java.util.*;
class sumofdigits{
  public static void main(String ar[]){
    int n,sum=0;
    Scanner d=new Scanner(System.in);
System.out.println("Enter n value");
    n=d.nextInt();
    while(n>0)
      {
        sum+=n%10;
    n=n/10;
  }
    System.out.println("sum of digits "+sum);
  }
}