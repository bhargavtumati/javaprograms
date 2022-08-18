//wap to count vowels in a given string
import java.util.*;
public class vowels{
  public static void main(String args[]){
    System.out.println("enter the string");
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    int count=0;
    for (int i=0;i<s.length();i++){
if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
        count++;
  }
    System.out.println("no of vowels "+count);
}}