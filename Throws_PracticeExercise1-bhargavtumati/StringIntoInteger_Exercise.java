/* 3. Write a code to convert an input string into integer value? If string contains any special character or space 
   then throw that exception to caller method.

   Sample Input: “ab4d”
   Expected Output: java.lang.NumberFormatException

   Sample Input: “4585”
   Expected Output: 4585     
*/
import java.util.*;
public class StringIntoInteger_Exercise {

   public static void main(String args[ ]) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter a string");
     String s=sc.nextLine();
     try{
     int n=Integer.parseInt(s);
       System.out.println(n);
     }
     catch(NumberFormatException e){
       System.out.println(e);
     }
     
   }

}
