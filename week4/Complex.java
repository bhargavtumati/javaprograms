//Print the sum, difference and product of two complex numbers by creating a class named 'Complex' with separate methods for each operation whose real and imaginary parts are entered by user.
import java.util.*;
class Complex{
  int r1,i1,r2,i2;
  void sum(){
    int sumr=(r1+r2);
    int sumi=(i1+i2);
    System.out.println("sum of 2 complex numbers:"+sumr+"+i"+sumi); 
  }
  void product(){
    int productr= (r1*r2 - i1*i2);
    int producti=(r1*i2 + i1*r2);
    System.out.println("product of 2 complex numbers: "+productr+"+i"+producti);
  }
  void difference(){
    int difr=(r1-r2);
    int difi=(i1-i2);
    System.out.println("difference of 2 complex numbers:"+difr+"+i"+difi);
  }
  public static void main(String args[]){
    System.out.println("enter real and imaginary parts of numbers");
    Scanner s =new Scanner(System.in);
    Complex obj=new Complex();
    obj.r1=s.nextInt();
    obj.i1=s.nextInt();
    obj.r2=s.nextInt();
    obj.i2=s.nextInt();
    obj.sum();
    obj.difference();
    obj.product();
  }
}