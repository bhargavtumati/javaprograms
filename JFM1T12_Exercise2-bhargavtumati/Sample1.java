/* Complete this java program to compare two sets and retain elements which are same on both sets.
   
   Sample Output:
   First HashSet content: [Red, White, Black, Green]                      
   Second HashSet content: [Red, Pink, Black, Orange]                     
   HashSet content: [Red, Black]
*/

import java.util.*;
  public class Sample1 {

    public static void main(String[] args) {
     
        HashSet<String> h_set1 = new HashSet<String>();
     	 // Use add() method to add values in the hash set
         h_set1.add("Red");
      h_set1.add("White");
      h_set1.add("Black");
      h_set1.add("Green");
          System.out.println("Frist HashSet content: "+h_set1);

          HashSet<String>h_set2 = new HashSet<String>();
         // Use add() method to add values in the hash set
h_set2.add("Red");
      h_set2.add("Pink");
      h_set2.add("Black");
      h_set2.add("Orange");
          System.out.println("Second HashSet content: "+h_set2);
         // Retain elements which are same on both sets
h_set1.retainAll(h_set2);
          System.out.println("HashSet content:");
          System.out.println(h_set1);
     }
}


