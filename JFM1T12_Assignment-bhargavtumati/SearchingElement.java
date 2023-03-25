/*  JFM1T12_Assignment1:

    Write a program to search an element in an arraylist.  
    Prompt the user input from the terminal.
    
    Sample Input 1:
    Enter how many Elements you want: 
    5
    Enter Elements: 
    Red
    Green
    Orange
    White
    Black
    
    Enter Search Element: 
    Red
    
    Expected Output:
    Red Element is present

    Sample Input 2: 
    Enter Search Element: 
    yellow
    
    Expected Output:
    yellow Element is not present

*/

import java.util.Scanner;
import java.util.ArrayList; 
import java.util.*;
class SearchingElement {
public static void main(String args[]){
//main method
int n,i;
//declare variables
Scanner sc=new Scanner(System.in);
//create scanner object
System.out.println("Enter no of elements");
  n=sc.nextInt();
//take input from user
LinkedHashSet<String> lh=new LinkedHashSet<>();
//creat an object of LinkedHashSet class 
  System.out.println("enter elements");
  for(i=0;i<n;i++)
    lh.add(sc.next());
  System.out.println("enter search element:");
  String e=sc.next();
  if(lh.contains(e)){
    System.out.println(e+" is present");
  }
//check if the search element is present on the list using contains method
else{
  System.out.println(e+" is not present");
}
//If element found then print element is present else then print element not present

}
}