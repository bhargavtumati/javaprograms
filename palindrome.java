//Write a java program to check whether a number is palindrome or not.
import java.util.*;
class palindrome{
  public static void main(String ravin[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number");
    int n=sc.nextInt(),rev=0,t;
    t=n;
    while(n>0){
      rev=(rev*10)+n%10;
    n=n/10;}
  if(rev==t)
    System.out.println("number is palindrome");
      else
    System.out.println("number is not palindrome");
  }
}