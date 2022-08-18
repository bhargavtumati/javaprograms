/* JFM1T4_Assignment3:
   Write a program to print all the prime numbers between 2 numbers.
   Prompt the user to enter the 2 numbers.
   
   Sample Input:
   Enter starting Number: 20
   Enter ending Number: 30

   Expected Output:
   Prime numbers between 20 and 30 are : 
   23
   29

*/

//import statements for java program to read inputs using Scanner class 
import java.util.Scanner;

public class PrimeNumbers {

//Add main method here
public static void main(String args[]){
//Declare variables num1, num2, i, count and initialize count as zero
int num1, num2, i,j,count=0;
//Use the scanner class to provide input at execution time using scanner object
Scanner s= new Scanner(System.in);
System.out.print("Enter Starting Number : ");
num1 = s.nextInt();
System.out.print("Enter End Number : ");
num2 = s.nextInt();
 for(i=num1;i<=num2;i++)
   {
     count=0;
     for(j=2;j<=i-1;j++){
     if(i%j==0){
     
       count++;
     }
      }
     if(count==0){
       System.out.println(i);
       }
   }
}
}