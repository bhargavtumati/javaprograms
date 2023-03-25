//Write a java program of sorting an array using any sort algorithm and then perform binary search on it

class Exercise1 {
  public static void main(String[] args) {
   int ar[]={7,5,6,8,9,5,1},i,j,temp;
    for(i=0;i<ar.length-1;i++){
      for(j=i+1;j<ar.length;j++){
        if(ar[i]>ar[j]){
          temp=ar[i];
          ar[i]=ar[j];
          ar[j]=temp;
        }
      }}
      for(i=0;i<ar.length;i++){
        System.out.print(ar[i]+" ");
      }
    
    int key=9, mid=(0+ar.length-1)/2,fir=0,las=ar.length-1;
    while(fir<=las)
    {
      if(ar[mid]<key){
      fir=mid+1; 
    }
    else if(ar[mid]==key){
      System.out.println(key+" found at index "+mid);
      break;
    }
    else if(ar[mid]>key){
      las=mid-1;
    }
      mid=(fir+las)/2;
  }
    if(fir>las){
      System.out.println(key+" not found");
    }
  }
}