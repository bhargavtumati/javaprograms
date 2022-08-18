//Write a java program to remove all duplicates from a given string?
public class removeduplicate{
  public static void main(String... args){
    String s="hfvvhsdhvvczchvhvvh";
    char a[]=s.toCharArray();
    for(int i=0;i<a.length;i++){
      for(int j=i+1;j<a.length;j++){
        if(a[i]==a[j])
          a[j]='\0';
      }if(a[i]!='\0')
        System.out.print(a[i]);
    }
  }
}