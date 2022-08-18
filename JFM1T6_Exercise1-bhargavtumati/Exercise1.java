//  Write a program to create a Book class and its objects.
//Create a class which contains the main method 
class Exercise1 {

	public static void main(String args[]) {

	//Write code here to create two Book objects, assign values to attributes and print
    
    Book b1 = new Book();
  b1.name = "bhargav";
  b1.subject = "science";


  Book b2 = new Book();
b2.name = "jahnavi";
b2.subject = "social";


System.out.print("first book ");
System.out.println(b1.name+" "+b1.subject);
System.out.print("second book ");
System.out.println(b2.name+" "+b2.subject);
	}
}
	
//Creating Book class
class Book {  
// Declare Book attributes
  String subject;
    String name;
  
}  

		    
