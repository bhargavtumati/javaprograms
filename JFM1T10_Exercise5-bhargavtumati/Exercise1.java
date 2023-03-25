//Write a program to create a protected method in parent class and access it in child class defined outside the package

class ParentClass{
  protected void disp(){
    System.out.println("protected method");
  }
}

class Exercise1 extends ParentClass{
  public static void main(String[] args) {
    ParentClass obj=new ParentClass();
    obj.disp();
    
  }
}