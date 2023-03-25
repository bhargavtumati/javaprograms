//Complete and execute this java program of method overloading/compile time polymorphism

class DemoOverload2 {

  void add(int a, int b){
  // write code to add two numbers 
System.out.println(a+b);
  }

  void add(String a, String b){
  // write code to concatenate two strings 
System.out.println(a+b);
  }
}

class Sample1 {
  public static void main(String[] args) {
    // create object and call overloaded methods
  DemoOverload2 obj=new DemoOverload2();
    obj.add(5,2);
    obj.add("good","job");
    
    
  }
}