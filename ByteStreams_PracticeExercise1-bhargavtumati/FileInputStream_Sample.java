/* 4. Write a program to find frequency of a given character in a file. Read character from keyboard and read data from a file. 
   Check how many times the given keyword occurred in file.
*/

import java.io.*;
import java.util.Scanner;
public class FileInputStream_Sample {
    
    public static void main(String args[]){

         // Create object for scanner class
Scanner s=new Scanner(System.in);
         System.out.println("Enter character to find frequency");
        // read character from keyboard
char search_char=s.next().charAt(0);
         int count=0;
         try{
       		FileInputStream fis=new FileInputStream("Data");
             	int ch;

            // read char by char from data file and find frequency of a search_char
while((ch=fis.read())!=-1){
  if((char)ch==search_char)
  count++;

           }
          System.out.println("The frequency of "+search_char+" is "+count);
         
   	  // close stream connection

       }
      catch(Exception e){
        System.out.println(e);
      }
         // Handle IOException using catch block

    }
    
}
