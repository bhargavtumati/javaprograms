/* 9.Write a program to read data from a file and find number of vowels in that file. 
   And print occurrence of each vowel in a file. */
import java.io.*;
public class FindingVowels_Exercise {

    public static void main(String args[]) {
try{
FileReader fr= new FileReader("abc.txt");
  int ch;
  FileWriter fw= new FileWriter("xyz.txt");
  while((ch=fr.read())!=-1){
    if((char)ch=='a'||(char)ch=='e'||(char)ch=='i'||(char)ch=='o'||(char)ch=='u')
    fw.write(ch);
    fw.flush();
  }
  
}
      catch(IOException e){
        System.out.println(e);
      }
    }
}