
/* JFM1T5_Assignment3:

   Write a program to store the temperature of your city for last 7 days and print the lowest temperature of the week.
   Prompt the user input from the terminal.
   
   Sample Input:
   Enter number of days 
   3
   Enter the temperature of Day :1
   88
   Enter the temperature of Day :2
   34
   Enter the temperature of Day :3
   0 
   
   Expected Output:
   The lowest temperature of the week 3 is 0.0 celsius

*/
import java.util.Scanner;

public class Temperature{

//Define the main method
public static void main(String ... args)
  {
    //Declare the variables and initialize
    int days,minday;
    float mintemp;
    Scanner sc=new Scanner(System.in);
    //Take temperature of 7 days as a input from user
    System.out.println("Enter number of days :");
    days=sc.nextInt();
    float temp[]=new float [days];
    for(int i=0;i<temp.length;i++)
      {
        System.out.println("Enter the temperature of Day :"+(i+1));
        temp[i]=sc.nextFloat();
      }
    mintemp=temp[0];
    minday=1;
    //Calculate the lowest temperature
    for(int i=0;i<temp.length;i++)
      {
        if(temp[i]<mintemp)
        {
          minday=i+1;
          mintemp=temp[i];
        }
      }
    //Print the result
    System.out.println("The lowest temperature of the week is in Day  "+minday+" i.e "+mintemp+" celsius");
    }

}