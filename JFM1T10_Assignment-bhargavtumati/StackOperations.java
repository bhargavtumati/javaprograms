/* JFM1T10_Assignment4:

     Create an interface named MyStack in package MyCollection with following methods- 
     void push(int I) 
     int pop() 
     Create two sub classes inheriting the MyStack interface.  
   1.class FixedStack that can accept a fixed numbers of integers. 
     The size of the Stack will be specified in the constructor. 
     If the number of integers exceed the size, “Stack overflow” message should be displayed. 
   2.class VariableStack that can accept numbers more than its size. 
     The size of the Stack will be specified in the constructor. 
     If the number of integers exceed the size, the stack should automatically grow to accommodate the new element. 
     Make a program that checks the implementation of both the classes. 
     Prompt the user for the  values to be input from the terminal.

     Sample Input:
     Enter a a few comma separated integers (Ex: 1,7,4)
     1,2,3,4,5

     Expected Output:
     Fixed Stack Overflows. Failed to push the integer:4
     Dynamic Stack Overflow. Increasing the stack length...Done
     Fixed Stack Overflows. Failed to push the integer:5
     Dynamic Stack Overflow. Increasing the stack length...Done
     Printing all elements of Fixed Stack
     3
     2
     1
     Printing all elements of Dynamic Stack
     5
     4
     3
     2
     1

*/

//Create a interface name MyStack

//Add a class FixedStack that implements StackOperations and create a methods push and pop

//Add a class DynamicStack that implements StackOperations and create a methods push and pop


import MyCollection.MyStack;
import java.io.*;
class FixedStack implements MyStack
{
  int size,top=-1;
  int fa[];
  FixedStack(int size)
  {
    this.size=size;
    fa=new int [size];
  }
  public void push (int i)
  {
    if(top>=size-1)
      System.out.println("Fixed Stack Overflows. Failed to push the integer: "+i);
    else
      fa[++top]=i; 
  }
  public int pop()
  {
    return fa[top--];
  }
  void print()
  {
    System.out.println("Printing all elements of Fixed Stack:");
    for(int i=top;i>=0;i--)
      {
        System.out.println(fa[i]);
      }
  }
}

class VariableStack implements MyStack
{
  int size,top=-1;
  int va[];
  VariableStack(int size)
  {
    this.size=size;
    va=new int [size];
  }
  public void push (int i)
  {
    if(top>=size-1)
    {
      int dupa[]=va;
      va=new int[++size];
      for(int j=0;j<=top;j++)
        va[j]=dupa[j];
      va[++top]=i;
      System.out.println("Dynamic Stack Overflow. Increasing the stack length...Done");
    }
    else
      va[++top]=i; 
  }
  public int pop()
  {
    return va[top--];
  }
  void print()
  {
    System.out.println("Printing all elements of Dynamic Stack:");
    for(int i=top;i>=0;i--)
      {
        System.out.println(va[i]);
      }
  }
}
class  StackOperations 
{
  public static void main(String args[]) throws IOException//Add main method here
  {
    BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
    FixedStack f=new FixedStack(3);
    VariableStack v=new VariableStack(3);
    System.out.println("Enter a a few comma separated integers (Ex: 1,7,4):");
    String elements[]=b.readLine().split(",");
    for(String i:elements)
      {
        f.push(Integer.parseInt(i));
        v.push(Integer.parseInt(i));
      }
    f.print();
    v.print();
  }
}