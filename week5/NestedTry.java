//wap to demonstrate nested try blocks
class NestedTry{
  public static void main(String args[]){
    int a=4;
    int b[]={4,5};
    try{
      System.out.println(a/1);
    try{
      System.out.println(b[4]);
    }
     catch(ArithmeticException j){
        System.out.println(j);
      }
    }
    catch(Exception h){
      System.out.println(h);
    }
  }
}