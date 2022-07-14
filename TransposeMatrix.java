/* JFM1T5_Assignment 4:

   Write a program to create a square matrix and print its transpose.
   Prompt the user input from the terminal.
   
  Sample Input:
  Enter number of rows: 3
  Enter number of columns: 3
  Elements  [1,1] : 2
  Elements  [1,2] : 3
  Elements  [1,3] : 4
  Elements  [2,1] : 1
  Elements  [2,2] : 2
  Elements  [2,3] : 3
  Elements  [3,1] : 4
  Elements  [3,2] : 5
  Elements  [3,3] : 6
   
  Expected Output:
    
  After Transpose Matrix  
  2       1       4
  3       2       5
  4       3       6
   
*/

import java.util.Scanner;

public class TransposeMatrix {

//Define the main method
public static void main(String[] args){
//Declare the variables
int i,j,n;
  
//Take input from user to enter rows and column values
Scanner sc=new Scanner(System.in);
  System.out.println("enter no of rows");
  n=sc.nextInt();
  System.out.println("enter no of columns");
  n=sc.nextInt();
  int arr[][]= new int [n][n];
  int transpose[][]= new int[n][n];
  for(i=0;i<n;i++)
    {
      for(j=0;j<n;j++)
        {
          System.out.println("Elements ["+i+"]["+j+"] :");
          arr[i][j]=sc.nextInt();
        }
//Convert the square matrix into transpose
for(i=0;i<n;i++)
  {
    for(j=0;j<n;j++)
      {
        transpose[i][j]=arr[j][i];
      }
  }
//Print the transpose matrix
  System.out.println("After Transpose Matrix");
  for(i=0;i<n;i++)
    {
      for(j=0;j<n;j++)
      {
        System.out.print(transpose[i][j]+" ");//printing j and i instead of i and j
  }
      System.out.println("");
    }
//Print the transpose matrix
  for(i=0;i<n;i++)
    {
      for(j=0;j<n;j++)
      {
        System.out.print(transpose[i][j]+" ");//printing j and i instead of i and j
  }
      System.out.println("");
    }
}
}
}
