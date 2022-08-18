/* JFM1T6_Assignment3:

   Write a method that takes any numbers as arguments/parameters and return the mean value back to main method.
   Prompt the user for the  values to be input from the terminal.

   Sample input:
   num1 = 3
   num2 = 2
   num3 = 4

   Expected Output:
   result = 3
   
*/

//main method

//declare variables and initialize sum=0

//create scanner object

//take input from user

//check the for loop for number of values entered in input
//calculate mean

//print result
 import java.util.Scanner;

public class Mean {
  float mean (Scanner s)
  {
    int sum=0;
    int n=0;
    System.out.println("Enter the elements to find their Mean\nEnter a character(except integers) to terminate Input or press ctrl+d!!");
    while(s.hasNextInt())
      {
        n++;
        sum+=s.nextInt();
      }
    return ((float)sum/n);
  }

public static void main(String args[])
  {
    float avg;
    Mean m=new Mean();
    Scanner sc=new Scanner(System.in);
    avg=m.mean(sc);
    System.out.println("result = "+avg);
  }
}

//Good Job!
//Please maintain proper comments in 
//Please push your assignment to github. If you have pused it, forget this comment.