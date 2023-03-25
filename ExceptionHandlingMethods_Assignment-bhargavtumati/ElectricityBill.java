/* 4. Write a program to Calculate Electricity Bill. Accept last month units and present units in string format from the user. 
      Calculate Electricity Bill for last month units, otherwise throw ArithementicException along with some error message.  
      Handle NumberFormatException while converting units into numerical value. 

  Calculate Electricity Bill based on following charges:

  ==> first 50 units charges are: 0.50 per/unit
  ==> next 100 units charges are: 1.75 per/unit
  ==> next 100 units charges are: 2.50 per/unit
  ==> above 250 units charges are: 2.90 per/unit

  Add 10% surcharge on overall bill.

*/
import java.util.*;
public class ElectricityBill {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter units consumed");
      String s=sc.nextLine();
      int units;
       try{
                 units = Integer.parseInt(s);  
        // variable to calculate electricity bill to pay  
        double billToPay = 0;  
        // check whether units are less than 100  
        if(units < 100)  
        {  
            billToPay = units * 1.20;  
        }  
        // check whether the units are less than 300  
        else if(units < 300){  
            billToPay = 100 * 1.20 + (units - 100) * 2;  
        }  
        // check whether the units are greater than 300  
        else if(units > 300)  
        {  
            billToPay = 100 * 1.20 + 200 * 2 + (units - 300) * 3;  
        }  
        System.out.println("The electricity bill for " +units+ " is : " + (billToPay*1.1)); 
     }
      catch(java.lang.NumberFormatException ex){  
            System.err.println("Please enter units in numbers");  }   
    }
    }
