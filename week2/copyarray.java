//Write a java program to copy all elements from an array to another array.
class copyarray{
  public static void main(String args[]){
    int a[]={-1,-2,2,-5,-6,-7,5,6,4,8},i;
    int j[]=new int[a.length];
    for(i=0;i<a.length;i++)
      {
        j[i]=a[i];
        System.out.println(j[i]);
      }
    
  }
}