//Write a java program to print the no of words from the given String
public class count{
public static void main(String args[]){
String s="bhargav is lover";
  String words[]=s.split(" ");
  int count=0;

    for(String w:words)  
count++;
  System.out.println("no of words "+count);
}
}