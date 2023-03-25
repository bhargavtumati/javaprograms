/*8.Write a program to read line by line from abc.txt file using BufferedReader class and 
  find count number of lines in a file then store number of lines info in xyz.txt file using BufferedWriter.
*/

import java.io.*;
public class BufferedWriterReader_Sample {
    
    public static void main(String args[]) {
        try{
            // create object for BufferedReader and BufferedWriter classes
BufferedReader br=new BufferedReader(new FileReader("abc.txt"));
          

            String str;
            int linecount=0;
            // read line by line from abc.txt file          
while((str=br.readLine())!=null){
  
linecount++;
            // count number of lines
}
      BufferedWriter bw =new BufferedWriter(new FileWriter("xyz.txt"));
           // store number of lines info into xyz.txt file

      bw.write(Integer.toString(linecount));
           bw.flush();
           bw.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
