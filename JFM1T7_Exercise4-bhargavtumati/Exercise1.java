// Write a program to demonstrate accessing an inner class
class Exercise1 {
int x=5;
  class InnerExercise1{
    int y=5;
  }
public static void main(String[] args){
  Exercise1 myouter = new Exercise1();
  Exercise1.InnerExercise1 myinner = myouter.new InnerExercise1();
  System.out.println(myouter.x+ " " +myinner.y);
}
}
