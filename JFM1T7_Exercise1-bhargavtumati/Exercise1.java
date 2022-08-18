//  Write a program to create a Movie class and its objects.
//Create a class which contains the main method 
class Exercise1 {

	public static void main(String args[]) {

	//Write code here to create two Movie objects, assign values to attributes and print the details using a method of 	//Movie class 
	Movie m1 = new Movie();
    m1.name= "don";
    m1.price= 250;
m1.display();
      Movie m2 = new Movie();
    m2.name= "prince";
      m2.price= 300;
    m2.display();
  }
}
	
//Creating Movie class
class Movie{  
// Declare Movie attributes
  String name;
  int price;
// Define display() method
  public void display(){
System.out.println(name+" "+price);
}  
}
