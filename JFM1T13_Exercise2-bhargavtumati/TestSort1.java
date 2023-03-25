//Objective of this java program to sort an ArrayList using Collections.sort()

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
      
 class TestSort1{  

    public static void main(String args[]){  

        //Here we have an ArrayList having String objects. Let's sort it using Collectios.sort method.
        ArrayList<String> al=new ArrayList<String>();  
        al.add("Viru");  
        al.add("Saurav");  
        al.add("Mukesh");  
        al.add("Tahir");  
        
        //Collection.sort() sorts an arraylist containing similar type of objects.
        Collections.sort(al);
  
        //Let's iterate over the arraylist and check whether its sorted or not.
        Iterator itr=al.iterator();  
        while(itr.hasNext()){  
        System.out.println(itr.next());  
        }  
    }  
 }  

