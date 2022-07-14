/*Write a java program to check whether a character is uppercase or lowercase     alphabet.*/
import java.util.*;
class Checkcase
  {
    public static void main(String[] args)
    {
      char c;
      Scanner o=new Scanner(System.in);
      System.out.println("Enter any character");
    c = o.next().charAt(0);
    if(Character.isUpperCase(c))//(c>='A'&&c<='Z')
      System.out.println("char is upper case");
      else if (Character.isLowerCase(c))//(c>='a'&&c<='z')
        System.out.println("char is lowercase");
    }
  }