/*3. Write a program to copy data from abc.txt file to xyz.txt file and display read data on console.*/

import java.io.*;
public class FileReadWrite_Sample {
        public static void main(String args[]){
            try {
            // Create object for FileReader and FileWriter class 
FileReader fr=new FileReader("abc.txt");
              
FileWriter fw=new FileWriter("xyz.txt");
            int ch;
            while((ch=fr.read())!=-1){// iterate while loop and read character by character 
             System.out.print((char)ch);
            // display read data on console

            // write data into xyz.txt file
fw.write(ch);
          }
              
        fw.flush();
        // close FileReader and FileWriter streams
fr.close();
              fw.close();

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}


