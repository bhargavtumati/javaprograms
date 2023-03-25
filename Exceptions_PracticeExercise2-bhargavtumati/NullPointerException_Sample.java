/* 7. Write a program to create Book class, declare name and price as instance variables and generate getter 
   methods and setter methods for these two variables. Create Sample class and within main method create object for 
   Book class and get book name from Book class and to get NullPointerException, convert into uppercase and print on console.
*/

class Book{
    private float price;
    private String name;
   // generate getter methods and setter methods
void setter(String name,float price){
  this.price=price;
  this.name=name;
}
  void getter(){
    System.out.println(name.toUpperCase()+" "+price);
  }


}
public class NullPointerException_Sample {
    public static void main(String args[]) {
    	// create object for Book class
Book j=new Book();
      j.setter(null, 500);
  	//  get Book name and print in uppercase
j.getter();

    }
}
