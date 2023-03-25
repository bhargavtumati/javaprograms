// Java Program to demonstrate the use of access modifiers
class Person {
  protected String fname = "Anand";
  protected String lname = "Krishnan";
  protected String email = "anand@krishnan.com";
  protected int age = 24;
}

class Student extends Person 
{
  private int graduationYear = 2018;
  public static void main(String[] args) 
  {
    Student myObj = new Student();
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Email: " + myObj.email);
    System.out.println("Age: " + myObj.age);
    System.out.println("Graduation Year: " + myObj.graduationYear);
  }
}
/* Objective of this java program is to understand different access specifiers: private, protected and public.

Let's create a class Person with data members that are protected

protected keyword is an access modifier used for attributes, methods and constructors, making them accessible to all the classes in the same package and subclasses in same or different package

Here a subclass Student accesses Person class protected attributes.

Student class also has a private date member.

private keyword is an access modifier used for attributes making them accessible only in the same class.

public keyword is an access modifier used for classes, methods and constructors, making them accessible anywhere.
*/