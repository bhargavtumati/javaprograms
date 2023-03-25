// Complete this java program to copy all of the mappings from the specified map to another map.
import java.util.*;  

public class Sample1 {  

   public static void main(String args[]) {

  // Create two hash maps with key as Integer and value as String
  Map<Integer,String> m=new HashMap<>();
     Map<Integer,String> p=new HashMap<>();
  // Populate both hash maps
  m.put(1,"Red");
     m.put(2,"Green");
     m.put(3,"Blue");
     System.out.println("Values in first map:"+m);
     p.put(4,"white");
     p.put(5,"Black");
     p.put(6,"Yellow");
     System.out.println("Values in second map:"+p);
     p.putAll(m);
  // Put all values in secondmap and print the values
  System.out.println("Now values in second map:"+p);
 
 }
}


/*
Sample Output:

Values in first map: {1=Red, 2=Green, 3=Blue}                         
                                                                       
Values in second map: {4=White, 5=Black, 6=Yellow}                      
                                                                       
Now values in second map: {1=Red, 2=Green, 3=Blue, 4=White, 5=Black, 6=Yellow}
*/
