/*Write a java program to input any character and check whether it is alphabet, digit    or special character.*/
import java.util.*;
public class Checkads{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a charater");
  char c = sc.next().charAt(0);
    if(c>='a'&&c<='z'||c>='A'&&c<='Z')
    System.out.println("Char is alphabet");
    else if(c>='0'&&c<='9')
      System.out.println("C is number");
    else
      System.out.println("C is special character");
  }
}