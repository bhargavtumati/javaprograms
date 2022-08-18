//Write a java  to Print the Alternate Elements in an Array
public class alternate{
    public static void main(String args[]) {
        int array[] = {100, 10, 25, 63, 96, 57},i;
      int size=array.length;
      for(i=0;i<size;i+=2)
          System.out.println(array[i]);
    }
}
