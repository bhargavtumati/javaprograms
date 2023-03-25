/*  JFM1T13_Assignment3:

      Write a Java program to count the number of key-value (size) mappings in a map. 
      Prompt the user input from the terminal.

      Sample Input: 
      Enter value:20
      Enter key:bitLabs
      Enter another student (y/n)?y
      Enter value:25
      Enter key:welcomes
      Enter another student (y/n)?y
      Enter value:30 
      Enter key:you
      Enter another student (y/n)?n

      Expected Output: The size of the map is 3
*/
import java.util.*;
public class MapCount {

//main method
public static void main(String args[]){
//declare HashMap object
Map<Integer,String> hp=new HashMap<>();
//create a while loop for user not enter no
char c='y';
  Scanner sc=new Scanner(System.in);
  while(c=='y'){
//ask for user input for value and key
System.out.println("enter key");
    int key=sc.nextInt();
//add the user inputs to the HashMap
System.out.println("enter value");
    String value=sc.next();
    hp.put(key,value);
    System.out.println("Enter another student (y/n)?");
    c=sc.next().charAt(0);
//ask user if they want to enter another
  }
//condition to satisfy in order to loop again
System.out.println("The size of the map is"+hp.size());
//print total size as result
}
}