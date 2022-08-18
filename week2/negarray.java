//Write a java program to print all negative elements in an array.
import java.util.*;
class negarray{
  public static void main(String[] args){
    System.out.println("enter elements");
    Scanner sc=new Scanner(System.in);
    int arr[]=new int[5],i,count=0;
    for(i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println("negative elements");
    for(i=0;i<arr.length;i++){
      if(arr[i]<0){
        System.out.println(arr[i]);
        count++;
      }
  }
    System.out.print("no of negative elements "+count);
}
}