//Write a program to calculate the sum of following series where n is input by user. 1 + 1/2 + 1/3 + 1/4 + 1/5 +..........1/n 
import java.util.*;
class series1plus1by2{
  public static void main(String[] args){
float n,i=1,sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter n number");
    n=sc.nextInt();
    while(i<=n)
      {
        sum=sum+(1/i);
        i++;
      }
    System.out.println(sum);
  }
  }