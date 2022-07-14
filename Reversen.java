//Write a java program to print all natural numbers in reverse (from n to 1). -     using while loop
import java.util.*;
class Reversen{
  public static void main(String ar[]){
    int n;
    Scanner d=new Scanner(System.in);
System.out.println("Enter n value");
    n=d.nextInt();
    System.out.println("printing numbers in reverse from n");
    while(n>=1){
    System.out.print(n+" ");
    n--;}
  }
}