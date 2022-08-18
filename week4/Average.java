//Print the average of three numbers entered by user by creating a class named 'Average' having a method to calculate and print the average
import java.util.*;
class Average{
  int a,b,c;
  int avg(){
    int avg=(a+b+c)/3;
    return avg;
  }
  public static void main(String... args){
    Average obj =new Average();
    Scanner sc=new Scanner (System.in);
    System.out.println("enter 3 numbers");
    obj.a=sc.nextInt();
    obj.b=sc.nextInt();
    obj.c=sc.nextInt();
    System.out.println("avg of 3 numbers "+obj.avg());
  }
}
