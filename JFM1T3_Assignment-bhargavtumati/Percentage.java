//JFM1T3_Assignment2:
/*
1.Write a program to calculate your percentage assuming total marks given. Print the percentage after rounding it off. 
  Allow user to input the marks from the terminal. 

  Sample Input:
        maximum_marks=500
        total_marks=348

  Expected Output:
        percentage= 70%
       

*/

//import statements for java program to read inputs using Scanner class 
import java.util.Scanner;

public class Percentage {

//Define the main method
public static void main(String args[]){
//Declare the variables
int total_marks;
int maximum_marks;
//Use the scanner class to provide total_marks and maximum_marks at execution time
/*
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the total marks");
total_marks= scanner.nextInt();
System.out.println("Enter maximum marks possible "); 
maximum_marks=scanner.nextInt(); 
*/
  Scanner scanner = new Scanner(System.in);
  System.out.println("Enter the total marks");
total_marks= scanner.nextInt();
  System.out.println("Enter maximum marks possible");
  maximum_marks= scanner.nextInt();

//Calculate the percentage of marks
float percentage=(total_marks*100)/maximum_marks;
//Print the Result
System.out.println("percentage of marks ="+percentage);
}
}