//Complete and execute this java program to practice 'super' keyword
class Animal {
  String type="animal";
}

class Dog extends Animal {
  public String type="mammal";

  public void printType() {
    System.out.println("I am a " + type);
    //Write a statement to print parent type using super
    System.out.println("I belong to "+super.type);
  }
}

class Sample2 {
  public static void main(String[] args) {
    //Write code to access child class method
    Dog j=new Dog();
    j.printType();
    
  }
}