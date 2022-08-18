import java.util.*;
class frequency{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a string");
    String s=sc.nextLine();
    String words[]=s.split(" ");
    int status[]=new int[words.length],i,j,count;
    for(i=0;i<status.length;i++)
      status[i]=0;
    for(i=0;i<words.length;i++){
      count=1;
      for(j=i+1;j<words.length;j++){
      if(words[i].equals(words[j])){
        count++;
        status[j]=-1;
      }}
        if(status[i]!=-1)
          System.out.println(words[i]+" has frequency of "+count);
    }
  }
}