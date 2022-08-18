// Write a program to declare two numbers as instance members, initialize them by taking user input in a method/constructor //and also create a add method for addition of those two numbers. 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Exercise1 {
int x;
  int y;
  BufferedReader b= new BufferedReader(new InputStreamReader(System.in));
  Exercise1() throws IOException
  {
    System.out.println("Enter value of x");
    x=Integer.parseInt(b.readLine());
    System.out.println("Enter value of y");
    y=Integer.parseInt(b.readLine());  
  }
  void add()
  {
    System.out.println("sum of two numbers "+x+" and "+y+" is "+(y+x) );
  }
public static void main(String[] args)throws IOException{
 Exercise1 e1= new Exercise1();
  e1.add();
}
}
