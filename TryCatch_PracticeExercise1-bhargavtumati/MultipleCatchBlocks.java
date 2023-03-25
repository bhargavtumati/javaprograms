/* 2. Write a program to illustrate multiple catch blocks.  
     • Declare array variable with 5 index positions.
     • Write the code which may throw ArithmeticException and ArrayIndexOutOfBoundsException in single line. [Ex: arr[5]=10/0].
     • Handle both the exceptions using multiple catch blocks.
*/

public class MultipleCatchBlocks {
    public static void main(String args[]) {
      // create array varaible with size 5
      int arr[]=new int[5];
      try {
           // add 30/0 in 5th index position of the array
         arr[5]=30/0;
      }
      // write catch block for handling ArithmeticException 
      catch(ArithmeticException ae){
           System.out.println("Arithmetic Exception occur");
      }
            // write catch block for handling ArrayIndexOutOfBoundsException
      catch(ArrayIndexOutOfBoundsException ae1){
    	   System.out.println("ArrayIndexOutOfBoundsException occur");
      }
            // write catch block for handling Exception
 
      catch(Exception e){
    	 System.out.println(e);
      }
    }
}

