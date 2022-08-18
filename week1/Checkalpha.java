/*Write a java program to check whether a character is alphabet or not.*/
import java.util.*;
class Checkalpha{
  public static void main(String[] args){
    char c;
    Scanner a=new Scanner(System.in);
    System.out.println("enter a character");
    c=a.next().charAt(0);
    if((c>='a'&&c<='z')||(c>='A'&&c<='Z'))
      System.out.println("alphabet");
    else
      System.out.println("not alphabet");
  }
}