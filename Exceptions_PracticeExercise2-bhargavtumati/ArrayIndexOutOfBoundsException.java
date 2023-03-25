/* 3. Write a program to illustrate ArrayIndexOutOfBoundsException.
   • Declare array variable and assign 5 integer values to that array.
   • To get ArrayIndexOutOfBoundsException, Try to access value from an array with index which is not present in array.

 */

public class ArrayIndexOutOfBoundsException {
    public static void main(String args[]) {
        //declare and initilize array varaible
        int arr[]={34,56,67,89,90};
        //print arr[5] index position
         System.out.println(arr[5]);
   }
}

