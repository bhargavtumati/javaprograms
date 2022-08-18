//wap to demonstrate polymorphism
  class Parentclass{
 void add(int a){
   System.out.println(a+a);
 }}
  class child1class extends Parentclass{
  void add(int a,int b){//using same method with diffferent parameters
    System.out.println(a+b);
  }}
    class child2class extends child1class{
      void add(float a,float b){// using same method with different attributes
        System.out.println(a+b);
      }
    }
public class polymorphism{
  public static void main(String args[]){
    child2class obj =new child2class();
    obj.add(9);
    obj.add(5,5);
    obj.add(4.5f,4.2f);
  }
}