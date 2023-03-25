//Complete this java program to demonstrate working of Collections.sort() 
import java.util.*; 
  
public class Sample1 { 
    public static void main(String[] args) { 
        // Create a list of strings 
 ArrayList<String> al=new ArrayList<>();
      al.add("blue");
      al.add("white");
      al.add("green");
      al.add("black");
  Collections.sort(al);
        // Sort the elements of ArrayList in ascending order
        
  
        // Print the sorted list 
        System.out.println("List after the use of" + 
                           " Collection.sort() :\n" +al ); 
    } 
} 