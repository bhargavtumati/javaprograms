/* Write a program to find number of days in a month
Test Data: 
month number=2
year=2020
Expected Output: February 2020 has 29 days
*/
import java.util.Scanner;

class Exercise2
  {

	public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Number of the Month:");
      int month=sc.nextInt();
      System.out.println("Enter the Year:");
      int year=sc.nextInt();
      switch(month)
        {
          case 1:
          case 3:
          case 5:
          case 7:
          case 8:
          case 10:
          case 12:
            System.out.println("Month "+month+" of "+year+" has 31 days");
            break;
          case 4:
          case 6:
          case 9:
          case 11:
            System.out.println("Month "+month+" of "+year+" has 30 days");
          case 2:
            if((year%400==0)||(year%4==0 && year%100!=0))
            {
              System.out.println("February "+year+" has 29 days");
            }
            else
            {
              System.out.println("February "+year+" has 28 days");
            }
        }
	  }

}