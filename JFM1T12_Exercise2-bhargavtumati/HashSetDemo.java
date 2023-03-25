// Objective of this program is to demonstrate interface Set's implementation using HashSet

import java.util.HashSet;
import java.util.Iterator;
public class HashSetDemo {
     public static void main(String args[]) {    

          //Let's create a HashSet of String type and add few names to it.
          HashSet<String> al=new HashSet<String>();  

          //Even if we try adding a duplicate element in Set type, it'll not 
          al.add("Ravi");  
          al.add("Vijay");  
          al.add("Ravi");  
          al.add("Ajay");  
          
          //Now let's quickly iterate over it and check what happened about duplicate insertion 
          //and also look at the natural order in which the elements are printed.
          Iterator<String> itr=al.iterator();  
          while(itr.hasNext()) {  
               System.out.println(itr.next());  
          }  
      }  
}  


