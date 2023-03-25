//Write an interface named Language and implement it by classes for programming languages like Java,Python, C# etc.
interface Language{
  public void Java();
  public void Python();
  public void C();
}


class Exercise1 implements Language{
 
   
public static void main(String[] args) {
    Language obj=new Exercise1();
  obj.Java();
  obj.Python();
  obj.C();
  
  }
}