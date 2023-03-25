/*Write a program to remove and return the first element of a linkedlist.

Sample Output:
Original linked  list: [Red, Green, Black, White, Pink]                
Removed element: Red                                                   
Linked list after pop operation: [Green, Black, White, Pink]

*/
import java.util.*;
class Exercise3 {
public static void main(String args[]){
  LinkedList<String> color=new LinkedList<String>();
  color.add("Red");
  color.add("Green");
  color.add("Black");
  color.add("White");
  color.add("Pink");
  System.out.println("Original Linked list"+color);
  System.out.println("Removed element:"+color.pop());
  System.out.println("Linked list after pop operation: "+color);
}


}