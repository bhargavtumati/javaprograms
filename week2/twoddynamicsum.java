//wap to print sum of elements of two different arrays
import java.util.*;
class twoddynamicsum{
  public static void main(String... h){
    int i,j,row,col;
    Scanner s=new Scanner (System.in);
    System.out.println("enter no of rows in matrix");
    row=s.nextInt();
    System.out.println("enter no of columns in matrix");
    col=s.nextInt();
    int [][] a=new int [row][col];
    int [][] b=new int [row][col];
    int [][] c=new int [row][col];
    System.out.println("enter a elements");
    for(i=0;i<row;i++){
      for(j=0;j<col;j++)
        a[i][j]=s.nextInt();
    }
    System.out.println("enter b elements");
     for(i=0;i<row;i++){
      for(j=0;j<col;j++)
        b[i][j]=s.nextInt();
    }
    for(i=0;i<row;i++){
      for(j=0;j<col;j++)
        c[i][j]=a[i][j]+b[i][j];
    }
    System.out.println("sum of two matrices");
    for(i=0;i<row;i++){
      for(j=0;j<col;j++)
        System.out.print(c[i][j]+" ");
      System.out.println();
    }
    
  }
}