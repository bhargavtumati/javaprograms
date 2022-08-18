//Write a Java program to create a new String object with the contents of a character array.
class Stringconv{
  public static void main(String... args){
    char ch[]={'a','e','r','o','p','l'};
    String obj= new String(ch);
    System.out.println(obj);
  }
}