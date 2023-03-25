/* 7. Write a program to append given string into a file using BufferedWriter class. handle IOException while writing data to a file.*/

import java.io.*;
public class BufferedWriter_Example {
    public static void main(String args[]) {
        // create string variable and assign some value to it
          String str="Welcome to character Streams";
          try{
              // create object for BufferedWriter class
              BufferedWriter fw=new BufferedWriter(new FileWriter("abc.txt",true));
              // write string to abc.txt file
              fw.write(str);
              fw.flush();
              }
             catch(IOException e){
             System.out.println(e);
            }
     }
}
