//Write a java program to find the first non-repeating character in a given String 
class nonrepeating{
  public static void main(String... args){
    String s="bhargav";
    int c=-1;
    for(char i:s.toCharArray())
      {
        if(s.indexOf(i)==s.lastIndexOf(i))
        {
          System.out.println("first non repeating character "+i);
        c=0; 
          break;
        }
      }
    if(c==-1)
      System.out.println("there are no non repeating characters");
  }
}