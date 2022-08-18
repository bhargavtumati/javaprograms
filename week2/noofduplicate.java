//Write a java program to count the total number of duplicate elements in an array.
import java.util.*;
class noofduplicate{
    public static void main(String[] args) {
        int arr[]={10,30,30,40,40},i,j,count=0;
        Scanner sc=new Scanner(System.in);
        for(i=0;i<arr.length;i++){
        for(j=i+1;j<arr.length;j++){
        if(arr[i]==arr[j])
        count++;}
        }
        System.out.println(count);
    }
}