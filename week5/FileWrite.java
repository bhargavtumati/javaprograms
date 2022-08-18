// write a program to write a file
import java.io.*;
public class FileWrite{
  public static void main(String[] args){
    FileWriter filewrite;
    try{
      filewrite =new FileWriter("ABC.txt");
      BufferedWriter bufferwrite =new BufferedWriter(filewrite);
      System.out.println("Buffered Writer start writing :)");
      bufferwrite.write(69);//Ascii value
      bufferwrite.write(49);//Ascii value
      //closing BufferWriter to end operation
    bufferwrite.close();
    }
    catch(Exception e){
      System.out.println(e);
    }
    
  }
}