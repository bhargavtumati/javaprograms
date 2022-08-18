/*print following series
    ********** 
    ********** 
    ********** 
    ********** */
import java.util.*;
class series1{
  public static void main(String ar[]){
    int i,j,r,c;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number of rows");
    r=sc.nextInt();
    System.out.println("enter number of coloumns");
    c=sc.nextInt();
    for(i=1;i<=r;i++){
      for(j=1;j<=c;j++){
        System.out.print("*");
      }
      System.out.println("");
    }
  }
}