interface kal{
  int add(int a,int b);//abstract method
  abstract void display();//100% abstraction
}
class Interfacedemo implements kal{
  public int add(int a,int b){
    return a+b;
  }
  public void display(){
    System.out.println("hello");
  }
  public static void main(String args[]){
  Interfacedemo obj=new Interfacedemo();
  System.out.println(obj.add(9,6));
  obj.display();
}
}