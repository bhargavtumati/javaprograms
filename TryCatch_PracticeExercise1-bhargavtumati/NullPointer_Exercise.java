/* 5. Write a code to declare two string variables and check if string is equal to the string “bitLabs”? 
   Write code for detecting the null pointer exception if the string is null.
 */
public class NullPointer_Exercise {

   public static void main(String args[ ]) {
     String s=null,b="bitlabs";
     try{
     System.out.println(s.equals(b));
   }
     catch(NullPointerException e){
       System.out.println(e);
     }
   }
}