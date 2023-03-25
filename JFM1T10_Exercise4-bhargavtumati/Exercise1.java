//Write a program to check and show whether a final class can be inherited or not
final class Student{
  void disp(){
    System.out.println("final");
  }
}
  class Details extends Student{
    void disp(){
      System.out.println("final");
    }
  }



class Exercise1 {
  public static void main(String[] args) {
    Details obj =new Details();
    obj.disp();
    
  }
}