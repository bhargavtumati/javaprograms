/* JFM1T13_Assignment2:

     Write a program to iterate through all elements in an ArrayDeque.Using iterator method
     Prompt the user input from the terminal.
     
     Sample Input: 12,31,6,23,90

     Expected Output:  
     ArrayDeque: [12, 31, 6, 23, 90]
     The iterator values are: 
     12
     31
     6
     23
     90
*/

import java.util.*;

public class IteratorArrayDeque {
public static void main(String args[]){
//create Scanner object
Scanner sc=new Scanner(System.in);
//create an empty ArrayDeque
  System.out.println("enter values of deque");
Deque<Integer> ad=new ArrayDeque<>(10);
//take input from user
ad.add(sc.nextInt());
ad.add(sc.nextInt());
ad.add(sc.nextInt());
ad.add(sc.nextInt());
ad.add(sc.nextInt());
  System.out.println("ArrayDeque: "+ad);
//create an iterator
Iterator it=ad.iterator();
  System.out.println("The iterator values are:");
//Display the values after iterating through the Deque 
  while(it.hasNext()){
    System.out.println(it.next());
  }
}
}