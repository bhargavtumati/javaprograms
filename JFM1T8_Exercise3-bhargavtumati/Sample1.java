// Complete and execute this java program using StringBuffer

public class Sample1 {
   public static void main(String []args) {
      StringBuffer s1 = new StringBuffer("bitLabs");
      //insert "Learning made easy @" before "bitLabs" in s1
     s1.insert(0, "Learning made easy @ ");
      //Expected output: Learning made easy @ bitLabs
     System.out.println(s1);
   }
}