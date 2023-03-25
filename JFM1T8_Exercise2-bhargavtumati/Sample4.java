// Complete and execute the java program to understand equals() method and == working with Strings

public class Sample4 {
   public static void main(String []args) {
      String s1 = "bitLabs";//string pool
      String s2 = "bitLabs";//string pool
      String s3 = new String ("bitLabs");// heap
      
      System.out.println(s1.equals(s2));//Compare s1 and s2 using equals() method
     System.out.println(s1==s2);//Compare s1 and s2 using '==' operator
      System.out.println(s2.equals(s3));//Compare s2 and s3 using equals() method
      System.out.println(s1==s3);//Compare s1 and s3 using '==' operator
   }
}