//Write a program to use 'super' keyword in Person class 

class Employee {
	String type = "Software Engineer";
	
	
}

class PermanentEmployee extends Employee {
	String type = "Full-time Software Engineer";
  void display(){
System.out.println("type of employee "+super.type);
  }
}

class Exercise2 {
  public static void main(String[] args) {
    PermanentEmployee m=new PermanentEmployee();
    m.display();
    
  }
}