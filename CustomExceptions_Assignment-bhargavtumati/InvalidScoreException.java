/* 4. Write a program to create custom exception to validate eligibility score to join in bitLabs. 
      Create InvalidScoreException and throw this exception if user entered score is less than 70.

  Sample input:
  Enter your score to check eligibility:  65

  Sample output: 
  Java.lang.InvalidScoreException: "Sorry, you are not eligible to join in bitLabs."


  Sample input:
  Enter your score to check eligibility:  89

  Sample output: 
  "Great, you are eligible to join in bitLabs."
*/
import java.io.*;
public class InvalidScoreException extends Exception{
  InvalidScoreException(String s){
    super(s);
  }

    public static void main(String args[])throws IOException, InvalidScoreException {
      System.out.println("enter your score");
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     int Score=Integer.parseInt(br.readLine());
      if(Score<70){
  throw new InvalidScoreException("Sorry, you are not eligible to join in bitlabs.");     
      }
      else
        System.out.println("Great, you are eligible to join in bitlabs.");
      
      

    }
}
