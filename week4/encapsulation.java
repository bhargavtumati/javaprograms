//wap to demonstrate encapsulation
class A{
  private int x;
  private int y;
  void setAtt(int a,int b){
    x=a;
    y=b;
  }
  void getAtt(){
    System.out.println(x+""+y);
  }
  }
class encapsulation{
  public static void main(String args[]){
A c=new A();
    c.setAtt(9,5);
    c.getAtt();
  }
}