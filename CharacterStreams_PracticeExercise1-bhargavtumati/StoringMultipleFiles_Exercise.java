/*10. Write a program read data from a file and write into multiple files based on following conditions.
  • Finds alphabets and store in alphabets.txt file.
  • Finds digits and store in digits.txt file.
  • Finds special characters and store in others.txt file.
*/
import java.io.*;
public class StoringMultipleFiles_Exercise {

    public static void main(String args[])throws IOException {
      FileReader fr=new FileReader("abc.txt");
      FileWriter fw1=new FileWriter("alphabets.txt");
      FileWriter fw2=new FileWriter("digits.txt");
      FileWriter fw3=new FileWriter("others.txt");
    int ch;
      while((ch=fr.read())!=-1){
        if((char)ch>='A'&&(char)ch<='z')
          fw1.write((char)ch);
          else if((char)ch>='0'&&(char)ch<='9')
            fw2.write((char)ch);
        else
            fw3.write((char)ch);
        fw1.flush();
        fw2.flush();
        fw3.flush();
        
      }

    }
}
