/* 5. Write a program to read one character at a time from a file and print it until it encounters a digit using FileInputStream 
class and handle FileNotFoundException, IOException ? 
                        
   Sample Input: welcome to bitLabs 123 Vijayawada 
   Expected Output: welcome to bitLabs
                       
   Sample Input: welcome to input and output streams
   Expected Output: welcome to input and output streams
*/
import java.io.*;
public class FileInputStream_Exercise {
    
    public static void main(String args[]){
      try {
        FileInputStream obj=new FileInputStream("Data");
      int ch;
      while((ch=obj.read())!=-1)
        {
          if(ch>=48&&ch<65){
            break;
          }
          System.out.print((char)ch);
          
        }
    }
      catch(Exception e){
        System.out.println(e);
      }
    }
}