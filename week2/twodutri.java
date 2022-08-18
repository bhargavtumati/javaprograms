//wap to print upper triangle of matrix arrays
import java.util.*;
class twodutri{
  public static void main(String... h){
    int i,j,row,col;
    Scanner s=new Scanner (System.in);
    System.out.println("enter no of rows in matrix");
    row=s.nextInt();
    System.out.println("enter no of columns in matrix");
    col=s.nextInt();
    int [][] a=new int [row][col];
    
    System.out.println("enter a elements");
    for(i=0;i<row;i++){
      for(j=0;j<col;j++)
        a[i][j]=s.nextInt();
    }
    System.out.println("upper triangle part of matrix is");
    for(i=0;i<row;i++){
      for(j=0;j<row;j++){
        if(j<i)
          a[i][j]=0;
      System.out.print(a[i][j]);
    }
System.out.println();    
  }
}
}