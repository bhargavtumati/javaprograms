// Java Program to demonstrate uses of final keyword 

class XYZ{  
   // Defining a method with final modifier
  //Remove "final" keyword to overcome the compilation error
   final void demo(){
      System.out.println("XYZ Class Method");
   }  
}  
	     
class FinalDemo extends XYZ{  
  
   // Compilation error in case of Overriding final method
   void demo(){
      System.out.println("Child Class Method");
   }  
	     
   public static void main(String args[]){  
      FinalDemo obj= new FinalDemo();  
      obj.demo();  
   }  
}
/* Objective of this program is to demonstrate that a final method cannot be overridden. 
Which means even though a sub class can call the final method of parent class but it cannot override it.
Note if the entire parent class would have been declared final, it would not have been possible to extend or inherit it.
Compiler will generate error in this case too that a final class cannot be inherited.
You can try this!
*/