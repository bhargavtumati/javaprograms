/* 10. Write a program to illustrate finally block. 
     • Declare string variable and assign value to that variable.
     • Find number of characters and print on console
     • Handle NullpointerException if string is null.
     • Write finally block and check it is executing in both the cases [ exception handled or not].
*/

public class FinallyBlock {
   public static void main(String args[ ]) {
      // declare string varaible and assign null to it
       String str=null; 
	try {
            // find number of character in str
         System.out.println(str.length());
    }
    // write catch block to handle NullPointerException 
    catch(NullPointerException e){
          System.out.println("string is empty");
    }
    // write finally block
    finally{
          System.out.println("Finally block");
    }
    System.out.println("After finally block");
   }
}

