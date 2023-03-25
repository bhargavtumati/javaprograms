/* 2. Write a program to illustrate NumberFormatException. To get NumberFormatException do below steps.
   --> Declare String variable and assign integer value along with special characters in double quotes.
   --> Convert given string into integer or float using parseInt() or parseFloat() methods.
*/

public class NullPointerException_Example1 {
    public static void main(String args[]){
        // Declare string varaible and assign 123&
        String str="123&";
        // convert string to integer
         int num=Integer.parseInt(str);
         //print num value
         System.out.println(num);
   }
}
