//  Complete and execute java program to create Student objects.

//Creating a class which contains the main method 
class Sample1 {

	public static void main(String args[]) {

	//Write code here to create two Student objects,assign value to their id and name and print the 			//details for both the objects
Student s1= new Student();
    s1.id= 94;
    s1.name = "bhargav";
    Student s2= new Student();
    s2.id = 95;
    s2.name = "murali";

    System.out.print("student 1 details ");
    System.out.println(s1.id+" "+s1.name);
    System.out.print("student 2 details ");
    System.out.println(s2.id+" "+s2.name);
	}
}
	
//Creating Student class
class Student {  
int id;  
String name;  
}