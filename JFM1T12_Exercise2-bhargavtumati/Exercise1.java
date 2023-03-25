//Write a Java program to convert a List/ArrayList(with duplicate elements) into HashSet containing no duplicates.
import java.util.*;
class Exercise1 {
public static void main(String args[]){
  List<String> al=new ArrayList<>();
  al.add("bhargav");
  al.add("ashoka");
  al.add("akbar");
  al.add("bhargav");
  System.out.println(al);
  Set<String> hs=new HashSet<>();
  hs.addAll(al);
  System.out.println(hs);
}


}
