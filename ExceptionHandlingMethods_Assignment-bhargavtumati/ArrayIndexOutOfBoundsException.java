/* 5. Write a program to find prime numbers from given two arrays and store in 3rd array. 
      Handle ArrayIndexOutOfBoundsException while storing values into 3rd array.
*/

public class ArrayIndexOutOfBoundsException {

    public static void main(String args[]) {
      int a[]={7,5,6,4,8,5};
        int b[]={17,19,29,37,14,16};
      int c[]=new int[5],i,j,count,k=0;
for(i=0;i<a.length;i++){
  count=0;
  for(j=2;j<a[i];j++){
    if(a[i]%j==0){
      count++;
    }
  }
  if(count==0){
    c[k]=a[i];
    k++;}
  }
      try{
      for(i=0;i<b.length;i++){
  count=0;
  for(j=2;j<b[i];j++){
    if(b[i]%j==0){
      count++;
    }
  }
  if(count==0){
    c[k]=b[i];
    k++;}
  }}
 catch(Exception e){
        System.out.println(e);
      }
}
    }
