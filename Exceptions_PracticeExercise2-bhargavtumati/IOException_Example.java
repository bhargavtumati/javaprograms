/* 6. Write a program to illustrate IOException. Create Object for File class and pass filename as a parameter. 
   Call createNewFile() method to create a file. Provide wrong path to get IOException.
*/

import java.io.*;
public class IOException_Example {
    
    public static void main(String args[]){
        // create object for File class
        File f=new File("files/abc.txt");//their is no folder files
        try{
            // call createNewFile() method
           f.createNewFile();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
