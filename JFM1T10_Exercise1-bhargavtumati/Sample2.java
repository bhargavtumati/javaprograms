//Complete and execute this java program of method overriding/run time polymorphism

class ParentClass {

  void add(int a, int b){
  // write code to add two numbers 
System.out.println("sum "+(a+b));
  }
}

class ChildClass extends ParentClass {
// override ParentClass method here
  void add(int a,int b){
    System.out.println("sum of two numbers "+(a+b));
  }
}

class Sample2 {
  public static void main(String[] args) {
	// create ParentClass object and call it's method
    ParentClass m=new ParentClass();
    m.add(1,2);
	// create ChildClass object and call overridden method
    ChildClass k=new ChildClass();
    k.add(1,2);
	// create ParentClass reference and ChildClass object and call method   
  ParentClass l=new ChildClass();
  l.add(1,2);
  }
}