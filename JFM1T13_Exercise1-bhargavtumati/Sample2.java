// Complete this java program demonstrating PriorityQueue.

import java.util.*;

  public class Sample2 {

    public static void main(String[] args) {

    // Create Priority Queue
    PriorityQueue<String> pq1 = new PriorityQueue<String>();  
      pq1.add("red");
      pq1.add("brown");
      pq1.add("yellow");
      

    // Use add() method to add values in the Priority Queue
    System.out.println("Original Priority Queue: "+pq1);
   pq1.remove();
      pq1.remove();
      pq1.remove();
    // Remove elements one by one from the Priority Queue
    
      
    System.out.println("The New Priority Queue: " + pq1);
  } 
}