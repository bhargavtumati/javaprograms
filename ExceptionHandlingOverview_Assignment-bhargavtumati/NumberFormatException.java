/* 2. Write a program which will illustrate NumberFormatException. Create a test method, with in the test method accept two numbers 
   using next() method of scanner class. Convert into numerical values and print addition of two numbers. 
   Please write your comments regarding NumberFormatException such as "When NumberFormatException will occur in this program?"
*/

public class NumberFormatException {
void add(String a,String b){
  System.out.println("sum: "+Integer.parseInt(a)+Integer.parseInt(b));
}
    public static void main(String args[]) {
      NumberFormatException e =new NumberFormatException();
      try{
      e.add("jsnnd","154");
      }
      catch(java.lang.NumberFormatException g){
        System.out.println(g);
      }
  
    }
}
