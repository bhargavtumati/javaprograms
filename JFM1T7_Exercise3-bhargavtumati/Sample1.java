// Complete and execute this java program to take input in Constructor using BufferedReader class
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 public class Sample1 {
    	String name;
	String favourite_book;
	
	//Create BufferedReader object
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	 // Declare constructor that throws IOException and write code to input your name and favourite book
	Sample1() throws IOException
   {
     System.out.println("Enter name: ");
   name=br.readLine();
     System.out.println("Enter your favourite book");
     favourite_book=br.readLine();
       }
	
	//Instance method
	public void display() {
		//Write code here to display name and favourite book
	System.out.println(name+ " "+favourite_book);
  }
	
	public static void main(String ...args)throws IOException {
		// Create object and call method
    Sample1 n1 = new Sample1();
    n1.display();
    Sample1 n2 = new Sample1();
    n2.display();
	}
}