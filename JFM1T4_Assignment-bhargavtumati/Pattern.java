/* JFM1T4_Assignment4:
   Write a program to print the following pattern:
     1 
     01 
     101 
     0101 
     10101 
*/

public class Pattern{
     
//Add main method here
public static void main(String[] args){
//Declare variable n and initialize value as 5
int n=5,i=1,j=1;
  
  for(i=1;i<=5;i++){
    for(j=1;j<=i;j++){
//Check whether the i and j are equal or not using for loop
if ((i==j)||(i+j)%2==0){
//If i and j are equal check (i+j)%2==0 or not if zero then print one else print zero
  System.out.print("1");
}
else{
System.out.print("0");
    }
      
    }
    System.out.println("");
  }
}
}