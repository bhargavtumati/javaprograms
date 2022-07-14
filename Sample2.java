// Complete and execute this java program for Student Application

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Sample2 {  
    // Declaring Instance variables
    	int roll_no;
   	String name;
	float marks;
	// Declaring static variable
	static String course="Java";
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	Sample2()throws IOException {
	System.out.println("Enter roll_no");
    roll_no = Integer.parseInt(br.readLine());
	// Take roll_no as user input
	System.out.println("Enter name");
	// Take name as user input
    name= br.readLine();
	System.out.println("Enter marks");
	// Take marks as user input
    marks = Float.parseFloat(br.readLine());
	}
	//Instance Method
	public void display(){
	System.out.println(roll_no+" "+name+" "+marks+" "+course);
	}
	public static void main(String ...args)throws IOException
	{
		Sample2 s1=new Sample2();
		s1.display();
		Sample2 s2=new Sample2();
		s2.display();
	}
}