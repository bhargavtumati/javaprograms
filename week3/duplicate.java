//Write a java program to print the duplicate characters from the given String
import java.util.*;
class duplicate{
  public static void main(String args[]){
    String s="bhargagav is";
    char c[]=s.toCharArray();
    
    for(int i=0;i<c.length;i++){
      for(int j=i+1;j<c.length;j++){
        if(c[i]==c[j]&&c[i]!='\0'){
          System.out.println(c[j]);
        c[j]='\0';}
      }
    }
  }
}
