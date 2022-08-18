//write a program to demonstrate multiThread
class Test2 extends Thread{
  public void run(){
    try{
      Thread.sleep(1000);
    }
    catch(Exception e){
      System.out.println(e);}
    System.out.println("child thread");
     
  }
}
class ThreadExample{
  public static void main(String args[]){
    Test2 t =new Test2();
    t.start();
    System.out.println("main thread");
    
  }
}