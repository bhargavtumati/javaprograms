//Write a java program to find maximum and minimum element in an array.
class mmarray{
  public static void main(String aerr[]){
    int a[]={10,20,40,11,12,15,16},i,j,temp;
  for(i=0;i<a.length;i++){
      for(j=i+1;j<a.length;j++){
        if(a[i]>a[j]){
          temp=a[i];
        a[i]=a[j];
        a[j]=temp;}//swapping least to a[i]
      }
  }
  System.out.println("maximum: "+a[a.length-1]);
    System.out.println("minimum: "+a[0]);
  }
}