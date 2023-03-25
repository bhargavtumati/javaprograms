//Objective of this program is to demonstrate bulk operation  methods of Collection.

import java.util.ArrayList;
import java.util.Iterator;  
public class TestCollection4 {
     public static void main(String args[]) {  
          
          //Here we have two ArrayLists storing names where name "Ravi" is common in both
          ArrayList<String> al=new ArrayList<String>();  
          al.add("Ravi");  
          al.add("Vijay");  
          al.add("Ajay");  

          ArrayList<String> al2=new ArrayList<String>();  
          al2.add("Ravi");  
          al2.add("Hanumat");  
          
          //let's use retainAll() method like al.retainAll(al2)
          al.retainAll(al2);  
          
          System.out.println("iterating the elements after retaining the elements of al2...");  

          //Now let's iterate over list al after retaining the elements of al2
          Iterator itr=al.iterator();  
          while(itr.hasNext()) {  
               System.out.println(itr.next());  
          }  
     }  
}  


//Explore the task: Check on the other bulk operation methods of Collection like addAll(), removeAll() etc.

