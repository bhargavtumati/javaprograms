// Complete and execute the java program to swap two Strings without using third variable

public class Sample3 {
   public static void main(String []args) {
      String s1 = "abc";
      String s2 = "def";
      s1 = s1.concat(s2);
      //Use substring method here to do swapping
     s2 = s1.substring(0,3);
     s1 = s1.substring(3,6);
     System.out.println(s1+" "+s2);
   }
}