// Complete and execute java program to understand Anonymous Inner Class
class Student {
  void reads() {
    System.out.println("Books");
  }
}

public class Sample3 {
 public static void main(String args[]) {
  // Create Anonymous inner class for Student, override it's method- reads() and access it
  Student s=new Student(){
  void reads(){//overriding
     System.out.println("Favourite Books");
   }
 };
  s.reads();
}
}

