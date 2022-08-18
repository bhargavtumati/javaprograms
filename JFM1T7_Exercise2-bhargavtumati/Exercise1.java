//  Write a Car class and initialize its objects using Constructor.
//Create a class which contains the main method 
class Exercise1 {

	public static void main(String args[]) {

	//Write code here to create two Car objects of your choice
	Car c1 = new Car();
    System.out.println("car model and price is "+c1.model+" "+c1.price);
  
  }
}
	
//Create Car class, it's attributes, constructor and method
class Car {  
String model;
int price;
 public Car(){
   model = "Suv200";
   price = 500000;

 }
}
		    
