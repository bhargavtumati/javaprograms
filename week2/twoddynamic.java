//wap to print each element of a dynamic array
import java.util.*;
class twoddynamic{
  public static void main(String... h){
    int i,j,row,col;
    Scanner s=new Scanner (System.in);
    System.out.println("enter no of rows in matrix");
    row=s.nextInt();
    System.out.println("enter no of columns in matrix");
    col=s.nextInt();
    int [][] p=new int [row][col];
    System.out.println("enter elements");
    for(i=0;i<row;i++){
      for(j=0;j<col;j++)
        p[i][j]=s.nextInt();
    }
     for(i=0;i<row;i++){
      for(j=0;j<col;j++)
       System.out.println(p[i][j]);
    } 
  }
}