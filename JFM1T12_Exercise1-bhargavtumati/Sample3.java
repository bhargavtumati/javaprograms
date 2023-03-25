// Complete this java program to iterate a linked list in reverse order.

import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;
  public class Sample3 {

    public static void main(String[] args) {
    
     LinkedList<String> l_list = new LinkedList<>();
     // Use add() method to add values in the linked list
       l_list.add("a");
      l_list.add("an");
      l_list.add("the");
     // Print original list
  System.out.println(l_list);
     // Print list elements in reverse order
     Iterator<String> it = l_list.descendingIterator();

    // Print the first item
    while (it.hasNext()) 
        {
            // Iterate in reverse
            System.out.println(it.next());
        }
  ListIterator<String> listIterator = l_list.listIterator(l_list.size());
      while (listIterator.hasPrevious())
        {
            System.out.println(listIterator.previous());
        }
        // print list in Reverse using for loop
        for (int i = l_list.size() - 1; i >= 0; i--)
        {
            // access elements by their index (position)
            System.out.println(l_list.get(i));
        }
     
   }
  }
