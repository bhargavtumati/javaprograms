/*print following series
    *
   **
  ***
 **** 
*****         */
import java.util.*;
class series3{
  public static void main(String ar[]){
    int i,j,k,rows;
    Scanner o=new Scanner(System.in);
    System.out.print("enter rows: ");
    rows=o.nextInt();
    for(i=1;i<=rows;i++){//condition
      for(j=1;j<=(rows-i);j++){
        System.out.print(" ");}//space
        for(k=1;k<=i;k++){
        System.out.print("*");//printing *
      }
      System.out.println("");//newline
    }
    
  }
}