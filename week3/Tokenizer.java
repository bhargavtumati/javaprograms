import java.util.*;
class Tokenizer{
  public static void main(String ... args){
    StringTokenizer st=new StringTokenizer("my name is khan");
    System.out.println("automatically takes space as delim");
    while(st.hasMoreTokens())
System.out.println(st.nextToken());
    StringTokenizer sr=new StringTokenizer("my name is khan","a");
    System.out.println("prints by taking 'a' as delim");
    while(sr.hasMoreTokens())
System.out.println(sr.nextElement());
    StringTokenizer v=new StringTokenizer("my name is khan");
    System.out.println(v.countTokens());
  }
}