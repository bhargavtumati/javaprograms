//Write a java program to calculate product of digits of a number.
import java.util.*;
class productofdigits{
  public static void main(String ar[]){
    int n,p=1;
    Scanner d=new Scanner(System.in);
System.out.println("Enter n value");
    n=d.nextInt();
    while(n>0)
      {
        p*=n%10;
    n=n/10;
  }
    System.out.println("product of digits "+p);
  }
}