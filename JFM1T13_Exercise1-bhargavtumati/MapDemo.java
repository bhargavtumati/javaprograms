// Objective of this java program is use demonstrate Map and HashMap

import java.util.Map;
import java.util.HashMap;

public class MapDemo {
      
     public static void main(String args[]){  

       //Let's create a HashMap with key- value pair. key as integer and value as string values.
      HashMap<Integer,String> hm=new HashMap<Integer,String>();  

      //Map interface not being the child of Collection interface has different methods like put and get. 
      //put method inserts key-value pair to HashMap.
      //Now, to access the key and values let's use Map.Entry interface here.
      hm.put(100,"Amit");  
      hm.put(101,"Vijay");  
      hm.put(102,"Rahul");  

      //In for-each loop, let's create a Map.Entry reference using entrySet() method on HashMap here.
      for(Map.Entry m:hm.entrySet()){ 
 
      //Finally let's print the key using getKey() method and values using getValue() method.
       System.out.println(m.getKey()+" "+m.getValue());  
      }  
     }  
    }  



