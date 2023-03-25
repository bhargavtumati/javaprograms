/*JFM1T9_Assignment1:
    Write a program applying Encapsulation to age field in Person class that cannot be accessed directly from outside class
    but can be accessed using setter and getter methods. 
    Steps to follow:
    Step1: Add age attribute to the Person class 
    Step 2: Add setter and getter methods for the age attribute  
    Prompt the user for the  values to be input from the terminal.

    Sample Input:
    Enter age: 32

    Expected Output:
    Your age: 32
    
     
*/
import java.util.*;
class Person { 
//declare age 
private int age;
//create setters and getters
    public void setAtt(int a){
      age=a;
    }
public void getAtt(){
  System.out.println("Your age: "+age);
}
}  

class PersonEncapsulation { 

public static void main(String args[]) { 

//main method
Scanner sc=new Scanner(System.in);
//create Scanner object
System.out.println("Enter age: ");
 int a=sc.nextInt();
  Person obj=new Person();
//take input from user
//System.out.println(age);
// Try accessing age field of Person directly and check whether it’s accessible
  obj.setAtt(a);
// or not.If not then try accessing it with it’s setter and getter methods. 
obj.getAtt();
// Output age  

}   

}
