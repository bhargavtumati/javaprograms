//Write a program of Inheritance(Surgeon is a Doctor)
class Doctor {
String d="Doctor";
}

class Surgeon extends Doctor{
String p="Surgeon";
  
}



class Exercise1 {
  public static void main(String[] args) {
    Surgeon c=new Surgeon();
    System.out.println(c.p+" is a "+c.d);
    
    
  }
}