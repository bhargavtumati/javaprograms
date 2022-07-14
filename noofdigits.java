//Write a java program to count number of digits in a number.
import java.util.*;
public class noofdigits{
public static void main(String[] args){
System.out.println("enter number");
  Scanner sc= new Scanner(System.in);
  int n=sc.nextInt(),c=0;
  while(n!=0)
  {
    n=n/10;
    c++;
  }
  System.out.println("no of digits ="+c);
}
}