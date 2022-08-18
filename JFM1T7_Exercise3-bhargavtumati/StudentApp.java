// Java Application for Student Application

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class StudentApp {  
    // Declaring Instance variables
    int roll_no;
    String name;
	float marks;
	// Declaring static variable
	static String college_name="IIT";
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	StudentApp()throws IOException {
	System.out.println("Enter roll_no");
	//Converting roll_no entered as String into int using Integer.parseInt()
	roll_no=Integer.parseInt(br.readLine());
	System.out.println("Enter name");
	name=br.readLine();
	System.out.println("Enter marks");
	// Converting marks entered as String into float using Float.parseFloat()
	marks=Float.parseFloat(br.readLine());
	}
	//Instance Method
	public void display()
	{
	// Declaring a Local variable
	int x=10;
	System.out.println(roll_no+" "+name+" "+marks+" "+college_name);
	}
	public static void main(String ...args)throws IOException
	{
		StudentApp s1=new StudentApp();
		s1.display();
		StudentApp s2=new StudentApp();
		s2.display();
	}
}