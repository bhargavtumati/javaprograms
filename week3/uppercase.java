//wap to print the first upper case character of string
import java.util.*;
class uppercase{
  public static void main(String... args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a string");
String a=sc.nextLine();
    char c[]=a.toCharArray();
    for(char i:c){
      if(Character.isUpperCase(i)){
        System.out.println(i);
      break;}
    }
    
  }
}