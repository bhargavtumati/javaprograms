//wap to creating empty string, string with literal,with char array,with char array with range,with another string
public class Stringdisplay{
  public static void main(String args[]){
    String s=new String();//empty string
    String b=new String("java");//string with literal
    char c[]={'a','b','c','d','k','j','w','s'};
      String d=new String(c);//with char array
    String f=new String(c,3,2);//with char array c with index 3 and no of char 2  
    String x=new String(b);//with another string b
    System.out.println(s+"\n"+b+"\n"+d+"\n"+f+"\n"+x);
    String l = "waiting for "+1+2+" months"+""+(7+8);
System.out.println(l);
  }
}