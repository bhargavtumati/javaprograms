// Java Program to illustrate static block

class Test { 
    static int i; 
    
    static { 
        i = 10; 
        System.out.println("static block called "); 
    } 
    Test(){ 
        System.out.println("Constructor called"); 
    } 
} 
  
class StaticBlock { 
    public static void main(String args[]) { 
  
       // Although there are two objects, static block is executed only once. 
       Test t1 = new Test(); 
       Test t2 = new Test(); 
    } 
}