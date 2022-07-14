import java.util.*;
class strongno{
  // Write a java program to check whether a number is Strong number or not.
  public static void main(String args[]){
    System.out.println("enter a number");
    Scanner sc=new Scanner(System.in);
    int t,sum=0,d,fac,no=sc.nextInt();
    t=no;
    while(t>0)
      {
        d=t%10;
        fac=1;
        while(d!=0){
          fac*=d;
          d--;
        }
        sum+=fac;
        t=t/10;
      }
    if(sum==no)
      System.out.println("is strong number");
    else
      System.out.println("not strong number");
  }
}