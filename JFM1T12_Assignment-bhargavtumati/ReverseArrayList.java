/*  JFM1T12_Assignmwnt4:

    Write a Java program to reverse elements in an arraylist.
    Prompt the user input from the terminal.
     
    Sample Input:
    Enter how many numbers you want: 
    5
    Enter Number 0
    995
    Enter Number 1
    367
    Enter Number 2
    511
    Enter Number 3
    789
    Enter Number 4
    111
    
    Expected Output:
    Elements after reversing:111 789 511 367 995  

 */

import java.util.*; 
import java.util.ArrayList; 

class ReverseArrayList  {  
ArrayList<Integer> reverseArrayList(ArrayList<Integer> al){
//Take an arraylist as a parameter and returns a reversed arraylist 
ArrayList<Integer> kl=new ArrayList<>();
//Arraylist for storing reversed elements
for(int i=al.size()-1;i>=0;i--)
  kl.add(al.get(i));
//Append the elements in reverse order 
return kl;}
//Return the reversed arraylist
  void printElement(ArrayList<Integer> kl){
Iterator<Integer> it=kl.iterator();
    System.out.print("Elements after reversing: ");
  while(it.hasNext())
    System.out.print(it.next()+" ");
//Iterate through all the elements and print
}

public static void main(String args[]){
//main method
ReverseArrayList r =new ReverseArrayList();
//creat an object of ReverseArrayList class 
Scanner sc=new Scanner(System.in);
  System.out.println("Enter how many numbers you want:");
  int n=sc.nextInt();
//take input from user
ArrayList<Integer> al=new ArrayList<>();
  for(int i=0;i<n;i++){
    System.out.println("Enter Number "+i);
  al.add(sc.nextInt());}
//creat an object of ArrayList class
r.reverseArrayList(al);
  
//call reverseArrayList method
r.printElement(r.reverseArrayList(al));
//call printElement method
}
}