/* 1. Write a program to read data from a file using FileInputStream class, Handle IOException if file is not present in given path. */

import java.io.*;
public class FileInputStream_Example {
    
    public static void main(String args[]){
       
         try{
             // create object for FileInputStream class
             FileInputStream fis=new FileInputStream("Data");
             // declare int variable (int ch;)
             int ch;
             // read character by character from file
             while((ch=fis.read())!=-1){
               // print character by character
                System.out.print((char)ch);
              }
            
         }
         // write catch block for handling IOException
         catch(IOException e){
             System.out.println(e);
         }
    }
}