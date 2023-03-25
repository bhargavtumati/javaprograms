//Write a Java program to insert elements into the arraylist at the first and last positions respectively.
import java.util.*;
class Exercise1 {
  public static void main(String args[]){
   List<Integer> number = new ArrayList<Integer>();
    number.add(456);
    number.add(457);
    number.add(745);
    number.add(744);
    System.out.println("original list"+number);
    number.add(0,748);
    number.add(number.size(),845);
    
    System.out.println("updated list"+number);
    System.out.println("index of 845: "+number.indexOf(845));
  }
}