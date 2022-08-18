/*Write a java program to check whether a number is negative, positive or zero. */
import java.util.*;
class Checknumber{
  public static void main(String[] args){
    int no;
    Scanner c = new Scanner(System.in);
    System.out.println("enter a number");
    no=c.nextInt();
    if(no<0)
      System.out.println("number is negative");
    else if(no==0)
      System.out.println("number is zero");
    else
    System.out.println("number is positive");
  }
}