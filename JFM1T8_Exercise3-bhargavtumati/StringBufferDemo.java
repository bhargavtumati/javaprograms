// Java Program to create mutable/changeable string objects with StringBuffer

public class StringBufferDemo {
   public static void main(String []args) {
    StringBuffer sb = new StringBuffer("bit"); 

    // The append() method adds the given string at the end of the original string
    sb.append("Labs");  
    
    System.out.println(sb);
   }
}