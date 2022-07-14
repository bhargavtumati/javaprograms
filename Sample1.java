//  Complete and execute java program using method to calculate square of a number
import java.util.Scanner;
class Sample1 {

// Create a method named square which accepts a number as parameter and returns square of that number
 int square(int x){
  return (x*x);
 }
  public static void main(String[] args) {
    int result;

    // call the method
    Sample1 obj = new Sample1();
    // store returned value to result
    result = obj.square(10);

    System.out.println("Squared value of 10 is: " + result);
  }
  

}
