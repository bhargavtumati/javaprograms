// Write a program to demonstrate a static block 
//Main Class
class Exercise2 {
public static void main(String[] args){
  StaticBlockDemo s= new StaticBlockDemo();
  System.out.println(s.i);
}

}

class StaticBlockDemo {
static int i;
  static{
    i=18;
    System.out.println("Static block called");
  }

}
