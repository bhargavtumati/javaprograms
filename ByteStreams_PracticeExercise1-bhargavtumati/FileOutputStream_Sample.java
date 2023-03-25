/* 3. Write a program accept string from keyboard and store into data.txt file using FileOutputStream classes. 
   Handle IOException if given path is wrong.
*/

import java.io.*;
import java.util.Scanner;
public class FileOutputStream_Sample {
    
    public static void main(String args[]){
         // Create object for scanner class
         Scanner s=new Scanner(System.in);


	System.out.println("Enter one line about bitLabs");
        
       // read string from keyboard
       String str=s.nextLine();

       //  convert user entered string into bytes
            byte b[]=str.getBytes();
         try{
       		FileOutputStream fw=new FileOutputStream("Data");
       
       		// write byte data into data file.
                fw.write(b);

        	System.out.println("Your Information stored in file successfully");
         
       		 // close stream connection
                fw.close();
         }
        // handle IOException using catch block
           catch(IOException e){
               System.out.println(e);
           }
    }
    
}
