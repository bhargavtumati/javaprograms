/* 1.	Write a program to create a method and throws NumberFormatException with method signature. 
   And handle NumberFormatException while calling that method in main method. 
*/

public class ThrowsExample {
    // create method called validate() and throws NumberFormatException
    public void validate() throws NumberFormatException{
          // convert string to int
         System.out.println(Integer.parseInt("123@"));
     }
     public static void main(String args[]){
     // create object for ThrowsExample class 
    	 ThrowsExample obj=new ThrowsExample();
   	 try{
             // call validate()
    	      obj.validate();
         }
       	 catch(NumberFormatException e){

          	System.out.println("cant convert to integer");
         }
     }
}

