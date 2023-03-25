/* 12. Write a program to create a method with string as a parameter and convert into uppercase. 
   If string does not contain any value [if it is null] then print some error message.
*/

public class StringUppercase_Exercise {
void upper(String s){
  System.out.println(s.toUpperCase());
}
    public static void main(String args[]) {
      StringUppercase_Exercise  obj= new StringUppercase_Exercise();
      obj.upper(null);

    }
}