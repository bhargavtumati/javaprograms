/* JFM1T11_Assignment4 :

   Write a program to sort an array of numbers in ascending order by comparing each number with every other number in 
   an array so that after each pass/iteration the smallest element reaches at it’s correct position. 

   Prompt the user input from the terminal.
   
   Sample Input: 4,6,3,9,10
   
   Expected Output: 10,9,6,4,3

 */

import java.util.Scanner;

public class AscendingOrder {

//main method
public static void main(String args[]){

  Scanner s=new Scanner(System.in);
  System.out.println("enter 5 array values");

//take input from user
int a[]=new int[5],i,j,temp;
  for(i=0;i<5;i++){
    a[i]=s.nextInt();
  }
//check input element numbers and printing all numbers using for loop
for(i=0;i<5;i++){
  for(j=i+1;j<5;j++){
    if(a[i]>a[j]){
  temp=a[i];
    a[i]=a[j];
    a[j]=temp;}
  }
  
}
//check all elements using for loop
System.out.println("sorted array:");
//check if first number is greater than the second number or not if true then swap
  for(i=0;i<5;i++){
    System.out.print(a[i]+" ");
  }
//check and print result
}
}

