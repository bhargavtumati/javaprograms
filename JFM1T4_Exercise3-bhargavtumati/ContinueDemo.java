// Java Program to demonstrate continue in loops.

public class ContinueDemo {
    
  public static void main(String[] args) {
      
  // Running a for loop from 0 to 9	  
  for (int i = 0; i < 10; i++) {
      
  // Checking the condition if i equals to 5  
  if (i == 5) {
  // Continuing the loop when the condition is true	by skipping the value 5  
    continue;
  }
  //Printing all the values except 5
  System.out.println(i);
 }
}
}