//wap to demonstrate insertion sort
class Insertionsort{
  public static void main(String args[]){
    int arr[]={85,12,45,75,11,15,15};
     int n = arr.length;
       for(int i=1;i<n;i++){
         int key=arr[i];
         int j=i-1;
         while(j>=0&&arr[j]>key){
       arr[j+1]=arr[j];
         j=j-1; 
       }
         arr[j+1]=key;}
    
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }
}