/* 3. Write a program to accept firstName, lastName and mobileNumber in string format. 
   Print number of characters in firstName and lastName, and print sum of digits of a mobileNumber. 
   Handle NumberFormatException while converting mobileNumber to long.
*/
import java.util.*;
public class NumberFormatException {

    public static void main(String args[]) {
      Scanner s=new Scanner (System.in);
     System.out.println("enter your first name");
      String firstName=s.next();
      System.out.println("enter your last Name");
      String lastName=s.next();
    System.out.println("enter mobile number");
      String mobile=s.next();
      long m=0;
        try {
            m = Long.parseLong(mobile);
            
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Enter only numbers");
        }
      int fnchar=0,lnchar=0,mdig=0;
      char ch1[]=firstName.toCharArray();
      char ch2[]=lastName.toCharArray();
      for(char c:ch1)
        {
          fnchar++;
        }
      for(char c:ch2){
        lnchar++;
      }
      while(m>0){
        m=m/10;
        mdig++;}
      System.out.println("no of char in first name "+fnchar+"\nno of char in last name "+lnchar+"\nno of digits in mobile number "+mdig);
       
    }
}
  
