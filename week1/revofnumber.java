//Write a java program to enter a number and print its reverse.
import java.util.*;
class revofnumber{
  public static void main(String ravin[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number");
    int n=sc.nextInt(),r=0;
    while(n>0){
      r=(r*10)+n%10;
    n=n/10;}
    System.out.println("reverse of number "+r);
  }
}