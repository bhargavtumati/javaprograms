//wap to read a file
import java.io.*;
public class ReadingFile{
  public static void main(String args[])throws Exception{
    FileReader fileread=new FileReader("test.txt"/*C:\\Users\\Bharghav\\Desktop\\test.txt*/);
    int i;
    while((i=fileread.read())!=-1)//reads char ascii value
      System.out.print((char) i);//converts ascii value to char value
  }
}