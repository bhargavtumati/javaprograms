//Write a java program to check whether a number is divisible by 5 and 11 or not.
import java.util.*;
class Divideby5or11{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter any number");
    int n=sc.nextInt();
    if((n%5)==0 && (n%11)==0)
      System.out.println("number is divided by 5 and 11");
    else
      System.out.println("nummber is not divided by 5 and 11");
  }
}