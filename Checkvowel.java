//Write a java program to input any alphabet and check whether it is vowel or    consonant.
import java.util.*;
class Checkvowel{
  public static void main(String[] args){
    char c;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter only lower case character");
    c=sc.next().charAt(0);
    if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
      System.out.println("character is vowel");
    else
      System.out.println("character is consonant");
    
  }
}