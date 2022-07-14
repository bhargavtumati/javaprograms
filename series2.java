/*print following series
*
**
***
****
*****    */
import java.util.*;
class series2{
  public static void main(String ar[]){
    Scanner n=new Scanner(System.in);
    System.out.print("enter no of rows: ");
    int rows=n.nextInt(),i,j;
    for(i=1;i<=rows;i++){
      for(j=1;j<=i;j++){
        System.out.print("*");
  }
      System.out.println("");
    }
  }
}