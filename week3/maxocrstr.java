//Write a java program to find the maximum occurring character in a given String
class maxocrstr{
  public static void main(String... args){
    String s="bhargav";
    int count=0;
    char string[] = s.toCharArray();
    int freq[]=new int[s.length()];
    for(int i=0;i<s.length();i++)
      {count=1;
        for(int j=i+1;j<s.length();j++){
          if((string[i]==string[j])&&string[j]!=' '&&string[j]!='\0'){
            count++;
          string[j]='\0';}
        }
       freq[i]=count;
      }
    int max=0;
    char maxchar=s.charAt(0);
    for(int i=0;i<freq.length;i++){
      if(max<freq[i]){
        max=freq[i];
      maxchar=string[i];}
    }
    System.out.println(maxchar+" "+max);
  }
}