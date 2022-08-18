// Java Program to demonstrate break in loops.

public class BreakLoopDemo {
    
  public static void main(String[] args) {
      
  // Running a for loop from 0 to 9	  
  for (int i = 0; i < 10; i++) {
  // Checking the condition if i equals to 5  
  if (i == 5) {
  // Breaking the loop when the condition is true	  
    break;
  }
  //Printing the values till 4
  System.out.println(i);
 }
}
}
