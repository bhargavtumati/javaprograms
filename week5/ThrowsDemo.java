//wap to demonstrate use of throws reader
import java.io.*;
class ThrowsDemo{
  public static void main(String args[])throws IOException,ArrayIndexOutOfBoundsException{
    int p=5;
    if(p!=5)
      throw new IOException();
      else
    throw new ArrayIndexOutOfBoundsException();
    
  }
}