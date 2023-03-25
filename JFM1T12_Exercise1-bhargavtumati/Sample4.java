// Complete this java program demonstrating Vector class.

import java.util.*;  
public class Sample4 {  
   public static void main(String args[]) {  
       //Create an empty vector with initial capacity 4  
       Vector<String> vec = new Vector<String>(4);  
       //Adding elements to a vector  
       vec.add("Vijaywada");  
       vec.add("Chennai");  
       vec.add("Bengaluru");  
       vec.add("Ooty");  
       //Print size and capacity  
           System.out.println(vec.size()+" "+vec.capacity());
       //Display Vector elements  
          System.out.println(vec);
       vec.addElement("Vellore");  
       vec.addElement("Coimbatore");  
       vec.addElement("Pondicherry");  
       //Again check size and capacity after new insertions  
           System.out.println(vec.size()+" "+vec.capacity());
       //Display Vector elements again  
          System.out.println(vec);
       //Check if Coimbatore is present or not in this vector         
           
       //Get the first element  
         System.out.println(vec.get(0));
       //Get the last element  
         System.out.println(vec.get(vec.size()-1));
   }  
}  