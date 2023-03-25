/*2. Write a program to store given string into a file using FileWriter class. Handle IOException while writing data to a file.*/

import java.io.*;
public class FileWriter_Example {
    public static void main(String args[ ]){
        // create a string variable and assign some value to it
        String str="Welcome to character Streams";
        try {
            // create object for FileWriter class
        FileWriter fw=new FileWriter("abc.txt");
            // write string data to abc.txt file
                   fw.write(str);
                   fw.flush();
        }
        // handle catch block to handle IOException
        catch (IOException e){   
            System.out.println(e);
        }
    }
}
