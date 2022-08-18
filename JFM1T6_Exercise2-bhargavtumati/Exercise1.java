//  Write a java method that accepts two numbers as parameters and swap their values
import java.util.Scanner;
class Exercise1 {

	public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
    System.out.println("Enter first number");
    int fnum = sc.nextInt();
    System.out.println("Enter second number");
    int snum = sc.nextInt();
    
	//Call method
Exercise1 obj =new Exercise1();
    obj.swap(fnum,snum);
  }

	// Define method
  void swap (int fnum, int snum){
    fnum= fnum+snum;
    snum= fnum-snum;
    fnum=fnum-snum;
    System.out.println("swapping values of numbers"+fnum+"and"+snum);
  }
}
