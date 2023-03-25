/* 3. Write a program which will illustrate ArrayIndexOutOfBoundsException. 
   Create an array variable with n size, accept values from user and store values into array, finally print all values on console. 
   Please write your comments regarding ArrayIndexOutOfBoundsException such as " When ArrayIndexOutOfBoundsException occur in this program?"
*/
import java.util.*;
public class ArrayIndexOutOfBoundsException {

    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter size of array");
      int n=sc.nextInt(),a[]=new int[n],i;
      for(i=0;i<n;i++)
        a[i]=sc.nextInt();
      try{
      for(i=0;i<=n;i++)
        System.out.println(a[i]);//here when i=n,arrayoutofboundsexception occurs because there is a[n] index
      }
      catch(java.lang.ArrayIndexOutOfBoundsException e){
        System.out.println(e);}
      
    }
}

