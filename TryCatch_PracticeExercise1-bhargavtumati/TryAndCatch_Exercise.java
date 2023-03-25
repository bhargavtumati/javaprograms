/* 7. Write a program to create a method with string as parameter and find number of vowels and number of consonants in entered string.
   if entered string is null then handle NullPointerException using try and catch blocks.
*/

public class TryAndCatch_Exercise {
  void vc(String s){
    int vowels=0,consonants=0;
    for(int i=0;i<s.length();i++){
if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
        vowels++;
      else
  consonants++;}
      System.out.println("no of vowels: "+vowels+"\nno of consonants: "+consonants);
  }

   public static void main(String args[ ]) {
String s=null;
     TryAndCatch_Exercise yi =new TryAndCatch_Exercise();
     try{
     yi.vc(s);
   }
     catch(NullPointerException e){
       System.out.println(e);
     }
   }
}
