//Write a program to print the names of students by creating a Student class. If no name is passed while creating an object of Student class, then the name should be "Unknown", otherwise the name should be equal to the String value passed while creating object of Student class.
class student{
  String name;
  student(String n){
name=n;
    System.out.println(name);
  }
  student(){
    System.out.println("unknown");
  }
}
class Name{
  public static void main(String args[]){
    student obj=new student();
  }
}