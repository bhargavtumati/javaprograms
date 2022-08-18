//wap to print last and first character of each word
class lfofeachword{
  public static void main(String[] args){
    String s="welcome to bitlabs";
    String words[]=s.split(" ");
    for(String w:words){
      System.out.println(w.charAt(0)+" "+w.charAt(w.length()-1));
    }
  }
}