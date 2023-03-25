/* 5. Write a program to accept n values and place in array. And accept k value from user. 
   Iterate for loop n+1 times and divide each number with k.
   The method should declare that it throws ArithmeticException and ArrayIndexOutOfBoundException 
   and handle this exception in caller method.
*/
import java.util.*;
public class Array_Exercise {

   public static void main(String args[ ]) {
System.out.println("enter size of array");
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt(),a[]=new int[n],i;
     System.out.println("enter array elements");
     for(i=0;i<n;i++){
       a[i]=sc.nextInt();
     }
     System.out.println("enter any element");
     int k=sc.nextInt();
     try{
     for(i=0;i<n+1;i++){
       a[i]/=k;
     }
   }
     catch(ArithmeticException e){
       System.out.println(e);
     }
     catch(ArrayIndexOutOfBoundsException f){
       System.out.println(f);
     }
   }
}
