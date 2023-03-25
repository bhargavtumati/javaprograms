/*6. Write a program to read line by line from a file using BufferedReader class. 
  Handle IOException while if specified does not exists in given path.*/

import java.io.*;
public class BufferedReader_Example {
    public static void main(String args[]) {
        try{
            // create object for BufferedReader class 
        BufferedReader f=new BufferedReader(new FileReader("abc.txt"));
        // create string variable
        String line;
        // iterate line by line till last line
        while((line=f.readLine())!=null){
            // print each line
            System.out.println(line);
        }
        // close BufferedReader stream connection
        f.close();
        }
        // write catch block to handle IOException
        catch(IOException e){
            
            System.out.println(e);
        }
    }
}
