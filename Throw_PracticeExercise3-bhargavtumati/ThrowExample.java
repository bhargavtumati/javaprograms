/* 16. Write a program illustrate throw keyword. Declare one integer variable as age and throw exception 
   if age is less than 18 years. Print welcome to vote message if age is greater than 18. 
*/

public class ThrowExample {
   public static void main(String args[]){
          // decalre age variable and assign 15 to it
            int age=15;
            // check age is <18 or not
            if(age<18){
                throw new ArithmeticException("Not eligible for vote");
            }
            else{
                   System.out.println("Welcome to vote");
           }
    }
}
