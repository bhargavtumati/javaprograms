//Write a java program to find frequency of each digit in a given integer.
import java.util.*;
class frequencyofdigits{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n,i,d,t,count;
    System.out.print("Enter number:");
    n=sc.nextInt();
    for(i=0;i<=9;i++){
      t=n;
      count=0;
      while(t>0)
        {
          d=t%10;
          if(d==i){
            count++;}
          t=t/10;
        }
      if(count>0)
      System.out.println(i+" "+count);
    }
  }
}