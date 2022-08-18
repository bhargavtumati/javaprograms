//wap to demonstrate binary search
import java.util.*;
class binarysearch{
  public static void main(String args[]){
    int n,key,pos=-1,i,j,temp;
    Scanner s=new Scanner(System.in);
    System.out.println("enter no of elements in the list");
    n=s.nextInt();
    int a[]=new int[n];
    System.out.println("enter elements of array");
    for(i=0;i<n;i++){
     a[i]=s.nextInt();
    }
    System.out.println("enter key value to search");
    key=s.nextInt();
    for(i=0;i<n;i++){// sorting array
     for(j=i+1;j<n;j++){
       if(a[i]>a[j]){
         temp=a[i];
         a[i]=a[j];
         a[j]=temp;
       }
     }
    }
      int low=0,high=n-1,mid;
      while(low<=high){// binary search
        mid=(low+high)/2;
        if(key==a[mid]){
          pos=mid;
          break;
        }
        else if(key<a[mid])
          high=mid-1;
          else
          low=mid+1;
        }
      
    
    if(pos==-1)
      System.out.println(key+"not available");
    else
      System.out.println(key+" available at index position "+pos);
  }
}
