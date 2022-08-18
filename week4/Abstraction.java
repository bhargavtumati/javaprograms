abstract class n{
  int a=10;
  int b=20;
  abstract void sum();//0 to 100% abstraction
}
class Abstraction extends n{//inheritance
  void sum(){
  int sum=(a+b);
  System.out.println(sum);}
  public static void main(String args[]){

  Abstraction obj=new Abstraction();
    obj.sum();
    
}    
  }
