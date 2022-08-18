//Write a java program to print all Armstrong numbers between 1 to n.
import java.util.*;
public class narmstrong{
public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  int f,l,i,temp,n=0,sum=0,lastdigit;
  System.out.println("enter first num");
  f=sc.nextInt();
  System.out.println("enter last num");
  l=sc.nextInt();
  for(i=f;i<=l;i++)
    {
      n=0;
      sum=0;
      temp = i;
        for (;temp != 0; temp /= 10, ++n);//calculating no of digits
        temp = i;//checking armstrong number or not
        for (;temp != 0; temp /= 10)
        {
            lastdigit = temp % 10;
            sum += Math.pow(lastdigit, n);
        }
        if(sum == i)
        System.out.print(i+" ");
    }
}
}