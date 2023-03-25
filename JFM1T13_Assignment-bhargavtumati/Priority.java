/* JFM1T13_Assignment1

     Write a program to create a priority queue, add some colors (string) and print out the elements of the priority queue. 
     Prompt the user input from the terminal.
     
     Sample Input: 
     Enter how many colors you want: 
     5
     Enter Colors: 
     red
     white
     green
     orange
     black
     
     Expected Output:
     Elements of the Priority Queue:  black, green, orange, red, white 
*/

import java.util.*;

public class Priority {
public static void main(String args[]){
//maiin method
Scanner sc=new Scanner(System.in);
//creat Scanner object
Queue<Integer> pq=new PriorityQueue<>();
  System.out.println("enter priority queue elements");
//initialize priority queue object
pq.add(sc.nextInt());
pq.add(sc.nextInt());
pq.add(sc.nextInt());  
//take input from user and add that values to the priority queue object
  System.out.println(pq);
  while(pq.size()!=0)
System.out.println(pq.poll());
//print result using poll method
}
}