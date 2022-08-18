//wap to demonstrate linear search
import java.util.*;
class Linearsearch{
  public static void main(String args[]){
    int n,key,pos=-1;
    Scanner s=new Scanner(System.in);
    System.out.println("enter no of elements in the list");
    n=s.nextInt();
    int a[]=new int[n];
    System.out.println("enter elements of array");
    for(int i=0;i<n;i++){
     a[i]=s.nextInt();
    }
    System.out.println("enter key value to search");
    key=s.nextInt();
    for(int i=0;i<n;i++){
      if(key==a[i]){
        pos=i;
      break;}
    }
    if(pos==-1)
      System.out.println(key+"not available");
    else
      System.out.println(key+" available at index position "+pos);
  }
}