//Write a java program of sorting an array using Bubble sort algorithm
//Bubble Sort is one of the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.
//To know more about Bubble sort click on the link https://en.wikipedia.org/wiki/Bubble_sort

class Exercise2 {
  public static void main(String[] args) {
    int ar[]={1,5,6,9,7,8,1},i,j,temp;
    for(i=0;i<ar.length;i++){
      for(j=0;j<ar.length-1;j++){
        if(ar[j]>ar[j+1]){
          temp=ar[j];
          ar[j]=ar[j+1];
          ar[j+1]=temp;
        }
      }
    }
    for(i=0;i<ar.length;++i)
      System.out.println(ar[i]);
  }
}