// Complete and execute this java program 

public class Sample1 {
   public static void main(String []args) {
      String s1 = "bitLabs";
      //Print index position of 'L' in "bitLabs"
     for(int i=0;i<s1.length();i++)
       if(s1.charAt(i)=='L')
       System.out.println(i);
      //Print "bitLabs" in lowercase
     System.out.println(s1.toLowerCase());
      //Print "bitLabs" in uppercase
     System.out.println(s1.toUpperCase());
      //Convert s1 into char array
     char s2[]= new char[s1.length()];
     for(int i=0;i<s1.length();i++)
       s2[i]=s1.charAt(i);
   }
}