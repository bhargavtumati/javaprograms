//Write a java program to sort array elements
public class sort{
    public static void main(String args[]) {
        int temp,array[] = {100, 10, 25, 63, 96, 57},i,j;
      int size=array.length;
      
        for(i = 0; i<size; i++ ) {
            for(j = i+1; j<size; j++) {
                if(array[i]>array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;//least 
                }
            }
        }
      System.out.println("after sorting in ascending order");
        for(i=0;i<size;i++)
          System.out.print(array[i]+" ");
      for(i = 0; i<size; i++ ) {
            for(j = i+1; j<size; j++) {
                if(array[i]<array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;//least 
                }
            }
      }
      System.out.println("\nafter sorting in descending");
        for(i=0;i<size;i++)
          System.out.print(array[i]+" ");
    }
}