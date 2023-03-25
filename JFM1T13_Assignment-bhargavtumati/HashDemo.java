/*    JFM1T13_Assignment5:  

      Create an application having a Generic HashMap with Empcode  as key and EmpName as value. Display only EmpNames as output. 
       Prompt the user input from the terminal.

      Sample Input: 
      Enter Emp code:101
      Enter Emp Name: Ram
      Enter another student (y/n)?y
      Enter Emp code:102
      Enter Emp Name: Vaibhav
      Enter another student (y/n)?y
      Enter Emp code:103
      Enter Emp Name: Priyanka
      Enter another student (y/n)?n

      Expected Output: 
        Ram
        Vaibhav
        Priyanka
       
*/

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class HashDemo {
public static void main(String args[]){
//main method
Map<Integer,String> hp=new HashMap<>();
//declare the HashMap 
  Scanner sc=new Scanner(System.in);
  char c='y';
while(c=='y'){
//create a while loop for user not enter no
System.out.println("Enter Emp code:");
 int Empno=sc.nextInt();
//ask for user input for value and key
  System.out.println("Enter Emp Name:");
  String Empn=sc.next();
hp.put(Empno,Empn);
//add the user inputs to the HashMap
System.out.println("Enter another student (y/n)?");
//ask user if they want to enter another student details
c=sc.next().charAt(0);
//condition to satisfy in order to loop again
}
//use for each loop to grab Emp code and Emp Name
for(Map.Entry<Integer,String> e:hp.entrySet()){
//print Emp Name
  System.out.println(e.getValue());
}
}
}
