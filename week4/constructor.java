class addition{
  int x;
  int y;

  addition(int a,int b){
    x=a;
    y=b;
  }
  
  int add(){
    int sum=(x+y);
    return sum;
  } 
}




public class constructor{
  public static void main(String args[]){
addition obj = new addition(4,7);
    System.out.println(obj.add());
  }
}