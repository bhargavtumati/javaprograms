//Complete and execute java program for static block

class Test { 
    static int i; 
    
    static { 
      i=10;// initialize and print static variable here
    System.out.println("bitlabs");
    } 
    
} 
  
class Sample2 { 
    public static void main(String args[]) { 
  Test t=new Test();
      System.out.println(t.i);
       
    } 
} 
