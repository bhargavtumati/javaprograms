//wap to demonstrate selection sort
class Selectionsort{
  public static void main(String args[]){
    int arr[]={2,10,11,15,18,9,4,5},i,temp,j;
    for(i=0;i<arr.length-1;i++){// selecting element
      for(j=i+1;j<arr.length;j++){//comparing elements
      if(arr[i]>arr[j]){
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
      }}
    }
    for(i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }
}