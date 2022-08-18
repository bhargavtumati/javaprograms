//print largest and smallest word in an string
class larsmalstring{
  public static void main(String[] args){
    String s= "Welcome to bitlabs";
    String w[]=s.split(" ");
    
    String maxw=w[0],minw=w[0];
  for(String x:w){
      if(x.length()<minw.length())
      minw=x;  
    else if(x.length()>maxw.length())
      maxw=x;
  }
  System.out.println("word with min length "+minw+"\nword with max length "+maxw);
  }
}