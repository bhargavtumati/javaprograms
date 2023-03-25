// Write a java program to demonstrate working of Collections.sort() to sort in descending order.
import java.util.*;
class Exercise1 {
public static void main(String args[]){
  ArrayList<Integer> al=new ArrayList<>();
  al.add(45);
  al.add(74);
  al.add(89);
  al.add(17);
  al.add(12);
  Collections.sort(al,Collections.reverseOrder());
  System.out.println(al);
}


}