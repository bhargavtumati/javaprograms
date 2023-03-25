/*   JFM1T12_Assignment5:

     Write a program to build any collection containing duplicates. Create its copy with all duplicates removed. 
     Prompt the user input from the terminal.
     
     Sample Input:
     Enter how many numbers you want: 
     4
     Enter Number 0
     4
     Enter Number 1
     3
     Enter Number 2
      3
     Enter Number 3
     4
     
     Expected Output:
     After removing duplicates: [4, 3]
*/     

import java.util.*; 
import java.util.ArrayList; 

class Duplicate  { 
public static void main(String args[]){
//main method
Scanner s=new Scanner(System.in);
//create Scanner object 
System.out.println("Enter array size");
  int n=s.nextInt(),i;
  System.out.println("enter array elements");
//take input from user
LinkedHashSet<Integer> lh=new LinkedHashSet<>();
//creat an object of LinkedHashSet class 
for(i=0;i<n;i++)
  lh.add(s.nextInt());
//creat an object of ArrayList class and pass LinkedHashSet object
  List<Integer> al=new ArrayList<>();
  al.addAll(lh);

//Print result
System.out.println(al);
}
}