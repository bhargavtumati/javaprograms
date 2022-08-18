//  Write a program to create a two dimensional array with duplicate elements and print only the duplicate elements.
class Exercise2 {
	public static void main(String args[]) {
  int a[][]={{1,1,3},{2,3,6},{7,8,8}};
  int b[]={-1,-1,-1,-1,-1,-1,-1,-1,-1};
    for(int i=0;i<a.length;i++)
      {
        for(int j=0;j<a[i].length;j++)
          {
            for(int k=0;k<b.length;k++)
              {
                if(a[i][j]!=b[k]&& b[k]==-1)
                {
                  b[k]=a[i][j];
                  break;
                }
                else if(a[i][j]==b[k])
                {
                  System.out.println(a[i][j]);
                  break;
                }
              }
          }
      }
   }
}