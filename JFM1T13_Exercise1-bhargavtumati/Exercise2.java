//Write a Java program to create a new priority queue, add some string values and print it's elements.
import java.util.*;
class Exercise2 {
public static void main(String args[]){
  PriorityQueue<String> q=new PriorityQueue<>();
  System.out.println("enter no of elements");
  Scanner s=new Scanner(System.in);
  int n=s.nextInt();
  System.out.println("enter elements");
  for(int i=0;i<n;i++)
    q.add(s.next());
 
 while(!q.isEmpty())
    System.out.println(q.remove());
}


}