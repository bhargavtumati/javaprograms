//Write a java program to find maximum between three numbers.
import java.util.*;
public class Maxof3{
public static void main(String[] args){
System.out.println("enter three different numbers");
  Scanner sc= new Scanner(System.in);
  int a=sc.nextInt();
  int b=sc.nextInt();
  int c=sc.nextInt();
if(a>b)
{
  if(a>c)
    System.out.println("a is great");
}
  else if(b>c)//as we know a is not great
    System.out.println("b is great");
  else
    System.out.println("c is great");
}
}