//wap to print all buffermethods
class BufferMethods{
  public static void main(String... args){
    StringBuffer s=new StringBuffer("welcome");
    s.append("you");
    System.out.println("append "+s);
    s.insert(2,"123");
    System.out.println("insert "+s);
    s.replace(3,5,"NOT");
    System.out.println("replace "+s);
    s.delete(3,5);
    System.out.println("delete "+s);
    s.reverse();
    System.out.println("reverse "+s);
  }
}