import java.util.*;
public class duplicateelements{
  static public void main(String... args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter no of elements");
    int n=sc.nextInt(), arr[]=new int[n],i,j;
    System.out.println("enter elements of array");
  for(i=0;i<n;i++)
      arr[i]=sc.nextInt();
    System.out.println("duplicate elements are:");
    for(i=0;i<n;i++)
      {
        
        for(j=i+1;j<n;j++)
          {
            if(arr[i]==arr[j])
         System.out.println(arr[j]);
          }
      
      }
  }
}
    
