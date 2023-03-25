/* 3.Write a program to illustrate Serialization and Deserialization.
  • Create book class and add book_name and price as parameters in Book class constructor.
  • Convert book class object and store in bookinfo file using FileOutputStream and ObjectOutputStream classes
  • Read data from bookinfo file and print book name and price on console.
*/

import java.io.*;
class Book implements Serializable{
    String book_name;
    float price;
    // create Book class constructor and pass book_name and price as parameters
Book(String name,float price){
  book_name=name;
  this.price=price;  
}
  void display(){
    System.out.println("book details: "+book_name+" "+price);
  }
    // create display method to display book name and price 
}
public class SerializationDeserialization_Sample {
    public static void main(String args[]) {
        // create object for Book class with arguments
Book b=new Book("Sati",496.0f);
        try{
            // create object for FileOutputStream and ObjectOutputStream class
          FileOutputStream fos=new FileOutputStream("book.txt");
          ObjectOutputStream oos=new ObjectOutputStream(fos);
oos.writeObject(b);
            // create object for FileIntputStream and ObjectIntputStream class
          FileInputStream fis=new FileInputStream("book.txt");
          ObjectInputStream ois=new ObjectInputStream(fis);
          Book c=(Book)ois.readObject();
          c.display();
          ois.close();
          fis.close();
          fos.close();
          oos.close();

            // store Book class object info bookinfo file

            oos.flush();
            // read data from bookinfo file and call display method

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

