//Assign and print the roll number,phonenumber,and address of two students having names "Sam" and "John" respectively by creating two objectsof class 'Student'.
class Student{
  int roll_number;
  long phone_number;
  String Address;
  void display(){
    System.out.println(roll_number+" "+phone_number+" "+Address);
  }
}
class StudentDetails{
  public static void main(String[] args){
    Student Sam = new Student();
    Sam.roll_number=1;
    Sam.phone_number=9492241458l;
    Sam.Address="69/2/25 Ventakapuram";
    Sam.display();
    Student John= new Student();
    John.roll_number=2;
    John.phone_number=9040613553l;
    John.Address="56/a Ram nagar";
    John.display();
  }
}