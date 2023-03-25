// Complete this java program to replace the second element of a ArrayList with the specified element.

import java.util.ArrayList;

  public class Sample1 {

    public static void main(String[] args){

      ArrayList<String>  color = new ArrayList<String>();

      color.add("Yellow");
      color.add("Green");

      // Replace the second element of arraylist with a new element
color.set(1,"Purple");
      // Print the modified arraylist
System.out.println(color);
    }
  }
