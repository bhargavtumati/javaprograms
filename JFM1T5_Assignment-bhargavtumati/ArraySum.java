 /*  
    JFM1T5_Assignment 1:
    Write a program to store 10 numbers in an array and display the sum of all the elements.
    Prompt the user for the 10 numbers to be input from the terminal.
    Sample Input:
    Enter the 10  elements:
    1
    2
    3
    4
    5
    6
    7
    8
    9
    10
    Expected Output:
    Sum of array elements is : 55
*/

import java.util.Scanner;
public class ArraySum {

//Define the main method
public static void main(String[] args){
//Declare the variables and initialize
  int sum=0;
  int arr[] = new int[10];
//Take input from user
Scanner sc=new Scanner(System.in);
 System.out.println("enter Elements");
for(int i=0;i<10;i++)
  {
    arr[i]=sc.nextInt();
  }
//Check user input values using for loop and add all values
 for(int i=0;i<arr.length;i++)
   {
     sum=sum + arr[i];
   }
//Print the result
System.out.println("sum of array elements is : "+sum);
}
}
