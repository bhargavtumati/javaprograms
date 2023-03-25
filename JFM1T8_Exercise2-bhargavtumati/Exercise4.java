//Write a program to find out first non repeated character from input String
public class Exercise4 {
	public static void main(String d[]){
    int i,j,count=0;
	String s="bhargav tumati";
    for(i=0;i<s.length();i++){
      for(j=0;j<s.length();j++){
        if(s.charAt(i)==s.charAt(j))
	count++;}
      if(count==1)
    System.out.println(s.charAt(i));}
}
}