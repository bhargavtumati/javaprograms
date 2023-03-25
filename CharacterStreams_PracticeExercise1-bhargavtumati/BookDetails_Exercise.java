/*4. Write a program which provides an option to either input the book details or display the book details. 
  In addition, on selecting the input option, the book details such as book name, author name, and price, 
  should be accepted and written into a text file. Future, if the display option is selected, 
  all the book details should be displayed. 
*/
import java.io.*;
import java.util.*;
public class BookDetails_Exercise {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      String Name,author,price;
      System.out.println("would you like to input details");
      boolean input=sc.nextBoolean();
      if(input){
        sc.nextLine();
        System.out.println("enter book name");
      Name=sc.nextLine();
        System.out.println("enter author name");
         author=sc.nextLine();
      System.out.println("enter price name");
       price=sc.nextLine();
          
      try{
FileWriter fw= new FileWriter("Book.txt");
      fw.write(Name);
      fw.write(author);
      fw.write(price);
        fw.flush();
    }
  catch(Exception e){
    System.out.println(e);
  }}
      System.out.println("you want to display details");
      boolean display=sc.nextBoolean();
      if(display){
        try{
      FileReader fw=new FileReader("Book.txt");
      int ch;
      while((ch=fw.read())!=-1){
        System.out.print((char)ch);
      }
      }
      catch(Exception e){
        System.out.println(e);
      }
    }
    }
}