//Complete and execute this java program of sorting an array using Selection sort algorithm

class Sample2 {

  public static void main(String[] args) {
     int arr[] = {9,14,3,2,43,11,58,22},i,j,temp;  
     for (i = 0; i < arr.length - 1; i++)  {   
     for (j = i + 1; j < arr.length; j++){  
     //Write Selection sort logic here
                if(arr[i]>arr[j]){
                  temp=arr[i];
                  arr[i]=arr[j];
                  arr[j]=temp;
                }
     }        
     }  
      for(i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
  }
}