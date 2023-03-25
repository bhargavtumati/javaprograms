/* 8. Write a program to read data from a file and find following points: 
   • Number of lines in a file.
   • Number of words in a file.
   • Number of characters in a file.
   Handle FileNotFoundException and IOException, if File is not present in specified path.

   Sample Input: 
   Enter your file name: Data.txt
 
   Expected Output: 
   Number of lines: 5
   Number of words: 25 
   Number of characters: 98
*/
import java.util.*;

import java.io.*;
public class StringOperations_Exercise {
    
    public static void main(String args[]){

      System.out.println("enter your file name");
Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      int word=0,line=1,count=0;
      try{
      FileInputStream fis=new FileInputStream(s);
      int ch;
      while((ch=fis.read())!=-1){
        if((char)ch==' '||(char)ch=='\n')
          word++;
        if((char)ch=='\n')
          line++;
        count++;
      }
        fis.close();
      }
      catch(Exception e){
        System.out.println(e);
      }
      sc.close();
      System.out.println("no of lines: "+line+"\nno of words: "+word+"\nNo of characters: "+count);
    }
}