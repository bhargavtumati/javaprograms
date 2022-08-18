//wap to demonstrate multithreading using runnable interface
class Test implements Runnable{
  public void run(){
    System.out.println("runnable interface");
    }
}
class RunnableExample{
  public static void main(String args[]){
    Test t =new Test();
    Thread t1=new Thread(t);
    t1.start();
    System.out.println("hi");
  }
}