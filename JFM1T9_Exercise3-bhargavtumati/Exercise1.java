//Write a program to use 'this' keyword in Person class 

class Person {
	int age;
	
	public void setAge(int age){
this.age=age;
    System.out.println("age of person "+age);
	}

}

class Exercise1 {
  public static void main(String[] args) {
    Person v=new Person();
  v.setAge(9);
    
  }
}