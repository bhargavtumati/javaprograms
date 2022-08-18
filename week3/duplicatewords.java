//Write a java program to print the duplicate words from the given String
public class duplicatewords{
public static void main(String args[]){
String s="welcome to to to bitlabs welcome";
  String words[]=s.split(" ");
  int status[]=new int[words.length];
  for(int i=0;i<status.length;i++){
    status[i]=0;
  }
  System.out.print("duplicate words(s) are: ");
 for(int i=0;i<words.length;i++){
   for(int j=i+1;j<words.length;j++){
     if(words[i].equals(words[j])&&status[i]!=-1){
       System.out.print(words[j]+" ");
     status[j]=-1;}
 }
}
}
}