//wap to print all factors of a given number
import java.util.*;
class factors{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter any number: ");
    int n=sc.nextInt();
    for(int i=1;i<n;i++)
      {
        if(n%i==0)
          System.out.print(i+" ");
      }
  }
}