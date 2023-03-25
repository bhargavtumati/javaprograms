/* 1. Write a program to illustrate OutOfMemoryError.  To get OutOfMemoryError do below steps.
     • Create ArrayList and Random classes objects.
     • Iterate while loop infinite times and store random values in ArrayList.
 */

import java.util.*;
public class OutOfMemoryError_Example {
    public static void main(String args[]) {
           // create Object for ArrayList class
              ArrayList al=new ArrayList();
              // create object for Random class
              Random r=new Random();
              // iterate infinite loop
              while(true){
                  // add random values to arraylist
             	al.add(r.nextInt());
              }
     }
}

