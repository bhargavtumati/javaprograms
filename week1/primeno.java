//wap to check whether a given number is prime or not
import java.util.*;
class primeno{
  public static void main(String args[]){
    int n,i,count=0;
    Scanner sc=new Scanner(System.in);
    System.out.print("enter any number: ");
    n=sc.nextInt();
    for(i=1;i<n;i++)
      {
        if(n%i==0)
          count++;
      }
    if(count==1)
      System.out.println("prime number");
    else
      System.out.println("not prime number");
  }
}