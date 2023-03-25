//Write a program to count number of words in a String
public class Exercise3 {
	public static void main(String d[]){
	String a="jahnavi is my sister";
    int count=1;
    for(int i=0;i<a.length();i++){
      if(a.charAt(i)==' ')
count++;
    }
    System.out.println("no of words "+count);
	}
}