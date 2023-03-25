/*1. Write a program to read data from a file using FileReader class. Handle IOException while if specified file does not exists in given path.*/

import java.io.*;
public class FileReader_Example {
    public static void main(String args[]){
        try {
           // create object for FileReader class
           FileReader f=new FileReader("abc.txt");
           // declare int variable
           int ch;
           // read character by character till end of the file
           while((ch=f.read())!=-1){
              // print read character
             System.out.print((char)ch);
           }
           // close stream connection
           f.close();
       }
       catch(IOException e){
         System.out.println(e);
      }
   }
}
