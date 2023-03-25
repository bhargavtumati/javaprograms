//Write a program to create a vector collection with initial capacity of 5 and add more than 5 elements into it. At last print both size and capacity.
import java.util.*;
class Exercise4 {
public static void main(String args[]){
  Vector<Integer> number=new Vector<Integer>(5);
  System.out.println(number.size()+" "+number.capacity());
  for(int i=0;i<10;i++)
    number.add(i);
  System.out.println(number.size()+" "+number.capacity());
}


}