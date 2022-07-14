//  Complete and execute java program example of using Scanner class
import java.util.Scanner;
class Sample1 {

	   public static void main(String[] args){
          //Create Scanner object 
       Scanner in = new Scanner(System.in);
          System.out.println("--------Enter Your Details-------- ");  
          System.out.print("Enter your name: ");    
          // Write java statement to input your name from console
       String name =in.nextLine();
          System.out.println("Name: " +name );    
       
          System.out.print("Enter your age: ");  
          // Write java statement to input your age from console 
       int age =in.nextInt();
          System.out.println("Age: " +age ); 
 
          System.out.print("Enter your marks: ");  
          // Write java statement to input your marks from console
       int marks =in.nextInt();
          System.out.println("Marks: " +marks );   
      
          in.close();           
  }
}
