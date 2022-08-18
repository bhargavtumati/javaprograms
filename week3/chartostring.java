//Write a Java program to create a new String object with the contents of a character array.
class chartostring{
public static void main(String args[]){
char ch[]={'a','b','m','n'};
  String s="";
  for(int i=0;i<ch.length;i++)
    s+=ch[i];
  System.out.println(s);
}
}