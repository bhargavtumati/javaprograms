/*Write a Java program to extract a portion of an arraylist.

Sample Output:
Original list: [Red, Green, Orange, White, Black]                      
List of first three elements: [Red, Green, Orange]

*/

import java.util.*;
class Exercise2 {
  public static void main(String args[]){
    List<String>color=new ArrayList<String>();
    color.add("Red");
    color.add("Green");
    color.add("Orange");
    color.add("white");
    color.add("Black");
    System.out.println("original list: "+color);
List<String>color2=color.subList(0,3);
    System.out.println("List of first three elements: "+color2);
}
  }