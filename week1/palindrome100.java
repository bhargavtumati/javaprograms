//wap to print palindrome numbers from 1 to 100
class palindrome100{
  public static void main(String[] args){
    int rev,i,temp=0;
    for(i=1;i<=100;i++){
      rev=0;
      temp=i;
     while(temp>0){
      rev=(rev*10)+(i%10);
      temp=temp/10;
    }
    if(rev==i)
      System.out.print(i+" ");}
  }
  
}