//wap to define inheritance example
class parentclass{
  int x=10;
}
class childclass extends parentclass{
  int y=10;
}
class module extends childclass{
  void display(){
  System.out.println(x+y);
}}
class inheritance{
  public static void main(String args[]){
    module obj=new module();
    obj.display();
  }
}