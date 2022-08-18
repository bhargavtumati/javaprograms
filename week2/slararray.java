//Write a java program to find second largest element in an array.
public class slararray{
    public static void main(String args[]) {
        int temp,array[] = {100, 10, 25, 63, 96, 57};
      int size=array.length;
      //rearranging array in increasing order
        for(int i = 0; i<size; i++ ) {
            for(int j = i+1; j<size; j++) {
                if(array[i]>array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;//least 
                }
            }
        }
        System.out.println("second largest number is: "+array[array.length-2]);//
    }
}