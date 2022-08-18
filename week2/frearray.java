//Write a java program to count frequency of each element in an array.
import java.util.*;
class frearray{
  public static void main(String[] args){
Scanner sc=new Scanner(System.in);
    int n,i,j,count;
   System.out.println("enter no of elements");
    n=sc.nextInt();
    System.out.println("enter elements");
    int a[]=new int[n];
    int status[]=new int[n];
    for(i=0;i<n;i++)
      {
        status[i]=0;
        a[i]=sc.nextInt();
      }
    for(i=0;i<n;i++)
      {count=1;
      for(j=i+1;j<n;j++)
        {
          if(a[i]==a[j])
          {
            count++;
            status[j]=1;
          }
        }
       if(status[i]==0)
        System.out.println(a[i]+" frequency is "+count);
      }
      }
}