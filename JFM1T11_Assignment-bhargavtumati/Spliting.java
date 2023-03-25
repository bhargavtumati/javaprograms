/* JFM1T11_Assignment6:

   Write a program to sort an array containing alphabets, special symbols and numbers.
   Prompt the user input from the terminal.
   
   Sample Input: bit01$$Lab02s03!@!!
   
   Expected Output: 
   Characters: bitLabs
   Numbers: 010203
   Special characters: $$!@!!

*/
import java.util.Scanner;
public class Spliting  { 
public static void main(String args[]){
//main method
Scanner s=new Scanner(System.in);
  System.out.println("enter string");
  String d=s.nextLine();
//take input from user
splitString(d);
//call splitString method
}
  static void splitString(String d){
    StringBuffer alpha=new StringBuffer("");
    StringBuffer num=new StringBuffer("");
    StringBuffer special=new StringBuffer("");
//create splitString method in that initialize alpha, num and special to stringBuffer
for(int i=0;i<d.length();i++){
  if(d.charAt(i)>='0'&&d.charAt(i)<='9')
    num.append(d.charAt(i));
  else if(d.charAt(i)>='a'&&d.charAt(i)<='z')
    alpha.append(d.charAt(i));
  else
    special.append(d.charAt(i));    
}
//check if the entered string is digit,alpha and special using if condition
System.out.println("alphabets: "+alpha+"\nnumbers: "+num+"\nSpecial Characters: "+special);
}
//printing seperatly characters in character, numbers in number and special characters in special character
}
