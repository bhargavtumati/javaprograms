/*5.Develop an application that accepts the name of a file and the word to be searched in that file. 
  Based on the input that user has provided, the application should display the number of occurrences of that word in file. 
*/
import java.io.*;
public class SerachingFile_Exercise {

    public static void main(String args[])throws IOException {
System.out.println("enter a word");
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      String w=br.readLine();
      int count=0;
      try{
      
      BufferedReader x=new BufferedReader(new FileReader("abc.txt"));
        String line;
        while((line=x.readLine())!=null){
          String j[]=line.split(" ");
          for(String i:j){
            if(i.equals(w)){
              count++;
            }
          }
        }
        System.out.println("count of word in file is "+count);
      
      
    }
      catch(IOException e){
        System.out.println(e);
      }
}
}