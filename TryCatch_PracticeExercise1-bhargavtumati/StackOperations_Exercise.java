/* 6. Write a program on stack operations and handle StackUnderflowException and StackOverflowException exceptions. 
   Declare stack with size n, and push elements in stack, handle StackOverflowException when you are trying to push more 
   than stack size and handle StackUnderflowException when you are trying to pop elements when stack is empty.
*/
class StackOverFlowException extends Exception{
  StackOverFlowException(String s){
    super(s);
  }
}
class StackUnderFlowException extends Exception{
  StackUnderFlowException(String s){
    super(s);
  }
}
public class StackOperations_Exercise {
  int size,top=-1,a[];
  StackOperations_Exercise(int size){
    this.size=size;
    a=new int[this.size];
  }
void push(int e) throws StackOverFlowException{
  if(top>size-1){
    throw new StackOverFlowException("cant push element");
  }
  else{
  a[++top]=e;
}
}
  void pop() throws StackUnderFlowException{
    if(top==-1){
      throw new StackUnderFlowException("no elements to remove");
    }
    else
      System.out.println(a[top--]);
  }
   public static void main(String args[ ]) {
StackOperations_Exercise obj=new StackOperations_Exercise(5);
     try{
     obj.push(4);
     obj.pop();
       obj.pop();
       obj.pop();
   }
     catch(Exception e){
       System.out.println(e);
     }
   }
}
