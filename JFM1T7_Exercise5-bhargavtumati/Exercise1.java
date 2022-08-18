// Write a program to create a class having a static final variable, a static method to display that variable and access it from another/ main class
//Main Class
class Exercise1{
static final int X=5;
  public static void display(){
    System.out.println(X);
  }

  public static void main(String[] args){
  display();
  }
}
