//Write a java program to check whether a number is Perfect number or not.
import java.util.*;
class perfectno{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number: ");
    int s=0,i=1,no=sc.nextInt();
    while(i<=(no/2))
      {
        if(no%i==0)
        s+=i;
        i++;
      }
    if(no==s)
      System.out.println("perfect number");
    else
      System.out.println("not perfect number");
  }
}