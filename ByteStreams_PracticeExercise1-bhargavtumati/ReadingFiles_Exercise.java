/* 7. Write a program to read first 3 lines from a file and print on console screen. 
   Handle IOException and FileNotFoundException while reading data from a file.
*/
import java.io.*;
public class ReadingFiles_Exercise {
    
    public static void main(String args[]){
      int count =0;
      try{
FileInputStream fis=new FileInputStream("Data");
      int ch;
      while((ch=fis.read())!=-1){
        if((char)ch=='\n')
          count++;
          if(count==3)
            break;
        else
        System.out.print((char)ch);
      }
    }
      catch(Exception e){
        System.out.println(e);
      }
    }
}