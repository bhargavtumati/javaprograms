//Complete and execute this java program illustrating the use of final keyword

class FinalDemo{  
   // Declare a variable with final modifier
	final int a=10;
	
   // Defining a method with final modifier
   final void demo(){
      System.out.println("ABC Class Method");
   }  
}  
	     
class Sample1 extends FinalDemo{  
   public static void main(String args[]){  
	// Access final variable and demo method
     FinalDemo obj=new FinalDemo();
     obj.demo();
       System.out.println(obj.a);
   }  
	// Check whether demo method can be overridden or not
  void demo(){
    System.out.println("ABC class method overriding");}
  }
