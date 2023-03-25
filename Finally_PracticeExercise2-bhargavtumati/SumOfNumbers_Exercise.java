/* 12. Given an array of integers and two indexes a and b. Print the sum of numbers between a and b indexes. 
   Handle ArrayIndexOutOfBoundsException if a or b index positions are not present in array. Print the sum of all elements in the finally block.
   Note: finally Block will always be executed. 

   Sample Input: n=4 arr = [4,5,7,8] a=2, b=4; 
   Expected Output: java.lang. ArrayIndexOutOfBoundsException
                         
   Sample Input: n=4 arr = [4,5,7,8] a=2, b=3; 
   Expected Output: Sum of the numbers is 15

*/
import java.util.*;
public class SumOfNumbers_Exercise {

   public static void main(String args[ ]) {
int c[]={4,7,8,9,4},a,b,sum=0,i;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter a,b values");
     a=sc.nextInt();
     b=sc.nextInt();
     try{
      for(i=a;i<=b;i++)
        sum+=c[i];
       System.out.println("sum of elements between a and b: "+sum);
     }
     catch(ArrayIndexOutOfBoundsException e){
       System.out.println(e);
     }
      finally{
        for(i=0;i<c.length;i++)
         sum+=c[i];
        System.out.println("sum of elements: "+sum);
     } 
   }
}
