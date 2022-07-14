/*Write a java program to input basic salary of an employee and calculate its Gross     salary according to following:
    Basic Salary <= 10000 : HRA = 20%, DA = 80%
    Basic Salary <= 20000 : HRA = 25%, DA = 90%
    Basic Salary > 20000 : HRA = 30%, DA = 95%*/
import java.util.*;
public class grosssalary{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    double basic;
    System.out.print("enter your basic ");
    basic=sc.nextFloat();
    if(basic<=10000){
      basic=basic+(0.2*basic)+(0.8*basic);
    System.out.println("your gross pay "+basic);}
    else if(basic<=20000){
      basic=basic+(0.25*basic)+(0.9*basic);
    System.out.println("your gross pay "+basic);}
    else{
      basic=basic+(0.3*basic)+(0.95*basic);
    System.out.println("your gross pay "+basic);}
  }
}