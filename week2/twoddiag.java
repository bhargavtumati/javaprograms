//wap to print diagnol elements of two dimentional matrix
import java.util.*;
class twoddiag{
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
    System.out.println("primary diagonal elements of array");
     for(i=0;i<row;i++){
       System.out.print(p[i][i]+" ");
    }
    System.out.println("\nsecondary diagonal elements of array");
    j=col-1;
    for(i=0;i<row;i++){
       System.out.print(p[i][j]+" ");
      j--;
    }
    
  }
}