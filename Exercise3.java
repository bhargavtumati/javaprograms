// Write a program to print the multiplication table of any number of your choice
import java.util.*;
class Exercise3 {

	public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("enter number for table");
    n=sc.nextInt();
    for(int i=1;i<=10;i++)
      {
        System.out.println(n+"*"+i+"="+(n*i));
      }

	}

}