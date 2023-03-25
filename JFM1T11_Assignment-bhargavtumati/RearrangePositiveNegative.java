/*  JFM1T11_Assignment5 :

    Write a program to sort an array containing negative, non-negative and zero values in descending order.
    Prompt the user input from the terminal.
    
    Sample Input: 2,-3,-1,4,-2
    
    Expected Output: -3,-2,-1,4,2
    
*/
import java.util.Scanner;
public class RearrangePositiveNegative {
public static void main(String args[]){
//main method
Scanner sc=new Scanner(System.in);
//take input from user
int a[]=new int[5],i;
  System.out.println("enter 5 array elements");
  for(i=0;i<5;i++)
    a[i]=sc.nextInt();
//call descending method
descending(a,5);
//print result
  System.out.println("sorted array");
  for(i=0;i<5;i++)
  System.out.print(a[i]+" ");
}
//create descending method
static void descending(int a[],int n){
//declare and initialize variables
int i,j,temp;
  for(i=0;i<n;i++){
    for(j=i+1;j<n;j++){
      //check each element if the element is less then zero and the both numbers are not equal  then it swaps them
    if(a[i]>=0&&a[i]!=a[j]){
      temp=a[i];
      a[i]=a[j];
      a[j]=temp;

    }}}
//increasing elements untill all elements rearranged
}
}