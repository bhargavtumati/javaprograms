// Complete and execute the java program to test immutability in String

public class Sample1 {
    
    public static void main(String args[]) {
        
    String s="Smart";
    
    //concat any string with s
    s.concat("phone");
      String s1=s.concat(" phone");
      System.out.println(s1);  
    }
}