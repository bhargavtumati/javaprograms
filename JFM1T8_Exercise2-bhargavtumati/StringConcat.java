// Java Program to illustrate String concatenation 
public class StringConcat  {
    
    public static void main(String args[]) {
        
    String str1 = "bit"; 

    // This will concatenate "Labs" to "bit" and overwrite str1
    str1 = str1.concat("Labs"); 

    System.out.println(str1); 
 
    }
}
/* Objective of this java program is to illustrate String concatenation 
Here String str1 = "bit"
Let's concat "Labs" with "bit" and store in str1
Storing in existing variable str1 will overwrite the old value in str1, now str1="bitLabs". 
*/