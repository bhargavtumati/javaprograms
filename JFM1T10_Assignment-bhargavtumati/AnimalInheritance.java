/*   JFM1T10_Assignment2:

     Create a class Animal that has a method makeSound(). 
     Then create two subclasses of Animal class: Horse and Cat that extends Animal class and 
     provide their specific implementation of makeSound() method.

     Sample Output:
     The animal makes a sound
     The Horse says: wee wee
     The Cat says: meow meow

*/
class Animal{
//Add Animal class and Create Sound() method 

void makeSound(){
  System.out.println("The animal makes a sound");
}}
class Horse extends Animal{//Add Horse class that extends Animal class
  void makeSound(){
    System.out.println("The Horse says: wee wee");
  }}
  class Cat extends Animal{
    void makeSound(){
      System.out.println("The Cat says: meow meow");
    }

  }
//Add Cat class that extends Animal class

class  AnimalInheritance {
 
//Add main method here
public static void main(String args[]){
//Create all 3 Animal objects and add to an array 
  Animal obj0=new Animal();
  Horse obj1=new Horse();
  Cat obj2=new Cat();
  Animal arr[]={obj0,obj1,obj2};
//Loop over the array and print sound it makes
for(int i=0;i<3;i++)
  arr[i].makeSound();
}
}

