//wap to define static example
class parent{
  int x;
  static int y;
  parent(int a){
  x=a;}
  static void show(){
    System.out.println(y);
  }
  void display(){
    System.out.println(x);
  }
}
class staticex{
  public static void main(String args[]){
    parent obj=new parent(9);
    obj.show();
    obj.display();
    
  }
}