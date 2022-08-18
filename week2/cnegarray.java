//Write a java program to count total number of negative elements in an array.
  class cnegarray{
  public static void main(String args[]){
    int a[]={-1,-2,2,-5,-6,-7,5,6,4,8},i,count=0;
    for(i=0;i<a.length;i++)
      {
        if(a[i]<0)
          count++;
      }
    System.out.println("no of negative elements: "+count);
  }
}