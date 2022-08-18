//wap to print all pre defined methods
public class predefmet{
  public static void main(String args[]){
String s="Good job";
String s1="Good Job";
    String d=" bhargav ";
    Integer x=5;
    System.out.println(s==s1); 
    String l = "waiting for "+1+2+" months"+""+(7+8);
    System.out.println(l);
    System.out.println("char at index position "+s.charAt(3));
    System.out.println("length of string "+s.length());
    System.out.println("ascii value comparision difference "+s.compareTo(s1));
    System.out.println("asci value comparision differnce(without case) "+s.compareToIgnoreCase(s1));
    System.out.println("compares two strings "+s.equals(s1));
    System.out.println("compares two strings without case "+s.equalsIgnoreCase(s1));
    System.out.println("combines two strings "+s.concat(s1));
    System.out.println("starts with or not "+s.startsWith("k"));
    System.out.println("ends with or not "+s.endsWith("k"));
    byte b[]=s.getBytes();
    for(int i=0;i<b.length;i++)
System.out.print(b[i]+" ");
    System.out.println("\nindex of specified string "+s.indexOf("o"));
    System.out.println("index of specified string from last "+s.lastIndexOf("ob"));
    System.out.println("check whether string is empty "+s.isEmpty());
    System.out.println("replace with specified string "+s.replace('G','3'));
    System.out.println("replace with specified string "+s.replaceAll("Go","33"));
    System.out.println("sub string "+s.substring(3,8));
    System.out.println("converts string to Lowercase "+s.toLowerCase());
    System.out.println("converts string to Upper case "+s.toUpperCase());
    System.out.println("removes whitespaces from both ends "+d.trim());
    System.out.println("converts the value to a string object "+x.toString()+" "+Integer.toString(12));
     String words[]=s.split("d",4);
    System.out.println("splited words");
    for(String w:words)  
System.out.println(w);
    
    
  }
}