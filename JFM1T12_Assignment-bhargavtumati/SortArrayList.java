/*  JFM1T12_Assignment2:

    Write a program to sort a given arraylist of integers in ascending order.   
    Prompt the user input from the terminal.
    
    Sample Input:
    Enter how many numbers you want: 
    5
    Enter Number 0
    467
    Enter Number 1
    342
    Enter Number 2
    167
    Enter Number 3
    511
    Enter Number 4
    204
    
    Expected Output:
    ArrayList After Sorting:
    167
    204
    342
    467
    511

*/     

import java.util.*;  

public class SortArrayList  {  
public static void main(String args[]){
//main method
int n,i,j,temp;
//declare variables
Scanner sc=new Scanner(System.in);
//create Scanner object
System.out.println("Enter how many numbers you want:");
  n=sc.nextInt();
//take input from user
List<Integer> al=new ArrayList<>();
  
  for(i=0;i<n;i++){
    System.out.println("enter element "+i);
    al.add(sc.nextInt());}
//create an object of ArrayList class
      for (i=0;i<al.size();i++) {
          for (j=i+1;j<al.size();j++) {
              if (al.get(i)>al.get(j)) {
                  int tmp=al.get(i);
                  al.set(i,al.get(j)) ;
                  al.set(j,tmp);
              }
          }
      }
//sort ArrayList in ascending oeder
System.out.println(al);
//print Array list
  sc.close();
}
}