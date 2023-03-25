/* 8.Write a program to find even values from given two arrays and store in 3rd array.
   Declare 3 array variables with size n, read values from array1 and array2 and find even values to store even 
   values into a 3rd array. Handle ArrayIndexOutOfBoundsException when you are trying to add elements into a 3rd array.
 */

public class Array_Exercise {

   public static void main(String args[ ]) {
int a[]={4,5,8,9,4,5,7},b[]={74,87,76,86,46,76,75};
     int c[]=new int[a.length],j=0;
     for(int i=0;i<a.length;i++){
       if(a[i]%2==0){
         c[j]=a[i];
         j++;
       }
     }
     try{
     for(int i=0;i<b.length;i++){
       if(b[i]%2==0){
         c[j]=b[i];
         j++;
       }
     }
   }
     catch(ArrayIndexOutOfBoundsException e){
       System.out.println(e);
     }
   }
}