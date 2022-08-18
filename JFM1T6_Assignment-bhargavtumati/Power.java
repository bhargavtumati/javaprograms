/* JFM1T6_Assignment2:
   Write a method that takes 2 numbers as arguments/parameters and returns the value of num2 to the power of num1 back to the main method.
   Prompt the user for the base and power values to be input from the terminal.

   Sample input:
   num1 = 3
   num2 = 2
    
   Expected Output:
   result = 9
   
*/
import java.util.Scanner;
public class Power {

//main method
int power(int n,int p)
  {
    int r=1;
     if(n>=0 && p==0)
    {
      return 1;
    }
    else if(n==0 && p>=1)
    {
      return 0;
    }
    else
    {
      while(p!=0)
        {
          r*=n;
          p--;
        }
      return r;
    }
  }

public static void main(String[] args){
//declare variables n,p,r and initialize r as one.
int n,p,r=1;
//create scanner class object
Scanner sc= new Scanner(System.in);
//take input from user

//check if (n>=0&&p==0) if true then it prints 1 else if check (n==0&&p>=1) if true then print zero else multiply r*n

//print result
System.out.print("Enter base:");
    n=sc.nextInt();
    System.out.print("Enter exponent:");
    p=sc.nextInt();
    Power obj=new Power();
    r=obj.power(n,p);
    System.out.println("Result: "+r);
    }
}

//Good Job!
//Please push your assignment to github. If you have pused it, forget this comment.
