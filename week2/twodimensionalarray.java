//wap to access each element of an array
public class twodimensionalarray{
  public static void main(String args[]){
  double[][] p={{10.2,0.5,3},{4,5,3},{1,5.4,11.3}};//{row1,row2,row3}static array
    for(int i=0;i<3;i++){
    for(int j=0;j<3;j++)
      System.out.println(p[i][j]);//p[row][column]
    }
}
}