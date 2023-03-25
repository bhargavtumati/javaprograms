//Write a program to check Encapsulation in Person class having age variable private and applying logic inside the setAge() method where age cannot be negative. 
//The getter and setter methods provide read-only or write-only access to our class fields.

class Person {
  private int age;
  public void setage (int newvalue){
  age = newvalue;}
  
public int getage (){
  return age;}
}

class Exercise1 {
  public static void main(String[] args) {
    Person person1= new Person(); 
    person1.setage(18);
    System.out.println("age of person is "+person1.getage());
    
  }
}