/* 6. Write a program to accept student information from keyboard such as name, marks, email id and college name.  
   And store into student.txt file using FileOutputStream class, and handle FileNotFoundException, IOException.
   
   Sample Input: 
   Enter name: ramu
   Enter marks: 90
   Enter email: ramu@gmail.com
   Enter college name: ABC college

   Expected Output: your information stored in file successfully.
*/
import java.util.*;
import java.io.*;
public class FileOutputStream_Exercise {
    
    public static void main(String args[]){
      Scanner s=new Scanner(System.in);
      System.out.println("enter name");
      String sc=s.nextLine();
      System.out.println("enter marks");
      sc+=s.nextLine();
      System.out.println("enter email");
      sc+=s.nextLine();
      System.out.println("enter college name");
      sc+=s.nextLine();
      try{
      FileOutputStream fos=new FileOutputStream("Student");
      fos.write(sc.getBytes());
        fos.close();
      }
      catch(Exception e){
        System.out.println(e);
      }
         System.out.println("Your information is stored in file sucessfully"); 
    }
}