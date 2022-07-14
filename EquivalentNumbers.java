/* JFM1T7_Assignment3:

   Accept an integer number as input from the console and when the program is executed print the binary, octal and hexadecimal equivalent of the given number.
   Prompt the user for the  values to be input from the terminal
   Hint: Refer Java Documentation and look for the appropriate Wrapper class method

   Sample Input: 20
   
   Expected Output: Binary equivalent: 10100 Octal equivalent: 24 Hexadecimal equivalent: 14
   
*/
import java.util.Scanner;
public class EquivalentNumbers {

//Main method
public static void main(String args[]){
  
//initialize Convert class constructor

  Convert c= new Convert();
//create Scanner object

//take input from user

//convert numbers into hexa,octal and binary

//print result
     System.out.println("Binary Equivalent:"+Integer.toBinaryString(c.number));
  System.out.println("Octal Equivalent:"+Integer.toOctalString(c.number));
  System.out.println("Hexadecimal Equivalent:"+Integer.toHexString(c.number));
}
}
//create Convert class in that declare variables
class Convert{
  int number;
  Convert(){
  Scanner sc=new Scanner(System.in);
//add getters and setters method
System.out.print("enter a number: ");
    number=sc.nextInt();
  } 
}
