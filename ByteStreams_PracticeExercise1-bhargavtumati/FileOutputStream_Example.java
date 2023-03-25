/* 2. Write a program declare string variable and assign some sentence to that variable, convert string into byte format and  
   store into data.txt file using FileOutputStream class. Handle IOException if given path is wrong.
*/
import java.util.*;
import java.io.*;
public class FileOutputStream_Example {
        public static void main(String args[]){
            // declare string variable and assign some string
          Scanner s=new Scanner(System.in);
            String str=s.nextLine();
          
            try{
                // create object for FileOutputStream class
                FileOutputStream fw=new FileOutputStream("Data");
                 // convert string into bytes and store in Data file
                fw.write(str.getBytes());
                // Close the stream connection
                fw.close();
       
       
            }
         catch(IOException e){
             System.out.println(e);
         }
   
    }
    
}