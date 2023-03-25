/* 5.Write a program to find factorial of a given number using recursive function. 
   Do not provide termination condition to get StackOverFlowError.
*/

public class StackOverFlowError_Exercise {
void factorial(int n){
  if(n==0)
    System.out.println(0);
  else{
    factorial(n++);
  }
}
    public static void main(String args[]) {
      new StackOverFlowError_Exercise().factorial(4);

    }
}