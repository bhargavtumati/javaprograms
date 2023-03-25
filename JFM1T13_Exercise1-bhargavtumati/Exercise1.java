/*Write a Java program to test if a map contains a mapping for the specified key.

Sample Output:
The Original map: {Red=1, White=4, Blue=5, Black=3, Green=6}           
1. Does key 'Green' exists?                                              
yes! - 6                                                           
                                                                       
2. Does key 'orange' exists?                                             
no!       
*/
import java.util.*;
class Exercise1 {
  public static void main(String args[]){
    System.out.println("enter no of elements");
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    Map<String,Integer> m=new HashMap<>();
    System.out.println("enter key values");
    for(int i=0;i<n;i++)
    m.put(s.next(),i+1);
    System.out.println(m);
    System.out.println("enter key");
    String key=s.next();
    System.out.println("Does key "+key+" exists?"); if(m.containsKey(key)){
      System.out.println("yes! - "+m.get(key));
    }
    else
      System.out.println("No!");
  }



}