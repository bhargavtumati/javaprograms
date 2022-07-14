//Write a java program to find first and last digit of a number.
import java.util.*;
class findfandl{
  public static void main(String args[]){
    int f,l;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number:");
    f=sc.nextInt();
    l=f%10;
    while(f>9){
      f=f/10;
    }
    System.out.println(f+" "+l);
  }
}