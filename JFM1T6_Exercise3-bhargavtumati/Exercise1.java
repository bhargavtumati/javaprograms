//  Write a java class "Calculator" in package "calc" and access it's functionality(add,subtract,multiply and divide) from main class outside the package "calc"
import calc.Calculator;
import java.util.Scanner;
class Exercise1{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
      System.out.println("enter first number ");
      int a= sc.nextInt();
      System.out.println("enter second number ");
      int b= sc.nextInt();
      //calling method
    Calculator c=new Calculator();
    System.out.println("Addition: "+c.addition(a,b)+ "\nSubtraction: "+c.subtraction(a,b)+"\nMultiplication: "+c.multiplication(a,b)+"\nDivision: "+c.division(a,b));
  }
}
