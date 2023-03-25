/*   JFM1T12_Assignment3:

     Write a program to copy one arraylist into another.
     Prompt the user input from the terminal.
     
     Sample Input:
     Enter how many numbers you want: 
     5
     Enter Number 0
     5
     Enter Number 1
     4
     Enter Number 2
     3
     Enter Number 3
     2
     Enter Number 4
    
    Expected Output:
    -----Iterating over the second ArrayList----
     5
     4
     3
     2
     1

*/

import java.util.*; 
import java.util.ArrayList; 

class CopyArrayList  { 
public static void main(String args[]){
//main method
  int n,i;
//declare variables
Scanner s=new Scanner(System.in);
  System.out.println("enter no of values");
  n=s.nextInt();
List<Integer> al=new ArrayList<>();
//create Scanner object
  System.out.println("enter values");
for(i=0;i<n;i++)
  al.add(s.nextInt());
//take input from user
List<Integer> al2=new ArrayList<>();
  for(i=0;i<n;i++)
  al2.add(al.get(i));
// Assign the first reference to second
Iterator<Integer> it=al2.iterator();
// Iterat over second ArrayList and print
  System.out.println("values of copied array");
while(it.hasNext()){
  System.out.print(it.next()+" ");
}
}
}