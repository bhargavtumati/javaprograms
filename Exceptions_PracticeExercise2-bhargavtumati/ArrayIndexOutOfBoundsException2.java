/* 4. Write a program to illustrate ArrayIndexOutOfBoundsException.
   • Declare array variable with 5 index positions.
   • To get ArrayIndexOutOfBoundsException, iterate for loop 6 times and store some values in array.
*/

public class ArrayIndexOutOfBoundsException2 {
       public static void main(String args[]){
               //create array varaible with size 5
            int arr[]=new int[5];
            // iterate for 6 times and store 100 value in each index
            for(int i=0;i<=5;i++){
                    arr[i]=100;
            }
       }
}
