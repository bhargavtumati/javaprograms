// Java Program to test immutability in String

public class ImmutabilityTest {
    
    public static void main(String args[]) {
        
    String s="Virat";
    //concat() method of String class appends a new string at the end  
    
    s.concat("Kohli");
    System.out.println(s);//Will print Virat because strings are immutable objects 
    
    // Store the result in new string 
    String s1= s.concat(" Kohli");
    System.out.println(s1);//Will print Virat Kohli because result is stored in new string 
        
    }
}