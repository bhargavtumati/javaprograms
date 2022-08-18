// Java Program to take input in Constructors using BufferedReader class
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 public class ConstructorInput {
    String x;
	String y;
	//BufferedReader object creation requires an InputStreamReader object as an argument/parameter
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
	 // Declare constructor that throws IOException to avoid errors while reading input
	ConstructorInput()throws IOException {
		System.out.println("Enter value for x");
		// readline() method of BufferedReader is used for String input
		x=br.readLine();
		System.out.println("Enter value for y");
		y=br.readLine();
	}
	//Instance method
	public void display() {
		System.out.println(x+" "+y);
	}
	// Main method also throws IOException as the constructor taking user input is invoked here
	// Errors thrown are brought to the calling block that also needs to handle them
	public static void main(String ...args)throws IOException {
		ConstructorInput myObj1=new ConstructorInput();
		// Calling method display() for myObj1
		myObj1.display();
		ConstructorInput myObj2=new ConstructorInput();
		// Calling method display() for myObj2
		myObj2.display();
	}
}
