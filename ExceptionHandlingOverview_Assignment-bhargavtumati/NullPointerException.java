/*4. Write a program which will illustrate NullPointerException. Create student class along with name, marks and city and add setter methods and getter methods.
  Create a method which can take student class as a parameter and print name, marks and city in method business logic.
  Write your comments regarding NullPointerException such "When NullPointerException will occur in program?"
*/
class Student{
  String name;
  int marks;
  String city;
  void setter(String name,int marks,String city){
    this.name=name;
    this.marks=marks;
      this.city=city;
  }
  void getter(){
    System.out.println(name+" "+marks+" "+city);
  }
}
public class NullPointerException {

    public static void main(String args[]) {
Student g=new Student();
      try{
      g.setter(null,455,"vijayawada");
        System.out.println(g.name.toUpperCase());//since their is length for object instance g.name, nullpointer exception occurs
      }
      catch(java.lang.NullPointerException e){
        System.out.println(e);
      }
      
    }
}

