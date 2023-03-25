//Complete and execute this java program of Inheritance

class Fruit {

  // field and method of the parent class
  String name;
  public void eat() {
    System.out.println("");
  }
}

// inherit from Fruit
class Apple extends Fruit {

  // new method in subclass
  public void display() {
    System.out.println("Name is " + name);
  }
}

class Sample1 {
  public static void main(String[] args) {

    // create an object of the subclass
    // access field of superclass
    // call method of superclass
    // using object of subclass
    Apple f =new Apple();
    f.name="Apple";
    f.eat();
    f.display();

  }
}


