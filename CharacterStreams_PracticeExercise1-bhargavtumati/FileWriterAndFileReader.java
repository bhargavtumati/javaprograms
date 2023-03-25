/* 11. Write a program to write data to a file using FileWriter and read data from same file using FileReader class. 
       Handle IOException while reading and writing data to a file, if specified file path does not exits.
*/

import java.io.*;
public class FileWriterAndFileReader {
    
    public static void main(String args[]) {
       // Decalre string variable and assign some value
         String str="welcome to bitLabs";
         try{
             // create object for FileWriter class
             FileWriter fw=new FileWriter("Data.txt");
             // write data to Data.txt file
             fw.write(str);
             fw.flush();
             // create object for FileReader class
             FileReader fr=new FileReader("Data.txt");
             int ch;
             // read character by character from file and print on console
             while((ch=fr.read())!=-1){
                  System.out.print((char)ch+" ");
             }
         }
         // write catch block for handling IOException
         catch(IOException e){
              System.out.println(e);
          }
       
    }
}