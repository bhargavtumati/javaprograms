//wap to demonstrate bubble sort
class Bubblesort{
  public static void main(String args[]){
    int arr[]={2,10,11,15,18,19,0,-1},i,temp,j;
    for(i=0;i<arr.length-1;i++){//iteration
    for(j=0;j<arr.length-1;j++){//comparing two elements
      if(arr[j]>arr[j+1]){
        temp=arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;
      }
    }}
    for(i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }
}
