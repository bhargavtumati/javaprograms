/* JFM1T11_Assignment1:

   Write a program to find a number in an integer array. If found print the number and the array index at which it is found. 
   Prompt the user input from the terminal.
   
   Sample Input: 2,4,6,1,7,8,9
   Enter number to search x= 9

   Expected Output: 9 found at index 6
   
   Enter number to search x= 12
   Expected Output: Sorry! 12 is not found in array.
   
*/

import java.util.Scanner;

public class FindNumberInArray {

//main method
public static void main(String args[]){
//declaring variables
int a[]=new int[7],i,e;
//creating Scanner object
Scanner sc=new Scanner(System.in);
//take input from user
System.out.println("enter 7 array elements");
  for(i=0;i<7;i++){
    a[i]=sc.nextInt();
  }
  System.out.println("enter element you want to search");
  e=sc.nextInt();
//find number in array
for(i=0;i<7;i++){
  if(e==a[i]){
    System.out.println(e+" found at index "+i);
    break;}
  else if(i==6)
    System.out.println("Sorry! "+e+" is not found in array.");

}
//search the element if found print that position else print not found message

}
}
