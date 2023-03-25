/* 5. Write a program create custom Exception to manage stock. Create OutOfStockException and throw this exception if user 
     entered stock is not present while purchase products. Create the following methods.
     ==> addStock(int qty)   : write code to add stock
     ==> purchase(int qty)   : write code to purchase products
     ==> diplayStock()       : write code to display available stock

  Display list of options to user before accept option from user, such as 
  1. addStock  
  2. purchaseProduct 
  3. displayStock
*/
import java.io.*;

public class OutOfStockException extends Exception {
  
  OutOfStockException(String e){
    super(e);
  }

    
    public static void main(String args[]) {
StockOperations f=new StockOperations();
      f.addStock(6);
      f.displayStock();
      
      f.purchase(7);
      }
}
class StockOperations {
  int Stock=0;
  void addStock(int qty){
    Stock+=qty;
    System.out.println("you have sucessfully addded stock");
  }

  int purchase(int qty){
    if(Stock<=0||qty>Stock){
      try{
      throw new OutOfStockException("out of stock");
      }
      catch(Exception e){
        System.out.println(e);
      }
    }
    else{
      Stock-=qty;
      System.out.println("you have sucessfully purchased stock");
    }
    
    return Stock;
  }

void displayStock(){
  System.out.println("available stock: "+Stock);}}