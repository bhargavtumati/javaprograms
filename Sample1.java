// Complete and execute java program to access static method of a class 
class Demo { 
    static final String INSTITUTE_NAME = "bitLabs"; 
      
    public static void disp() { 
     System.out.println(INSTITUTE_NAME);      
    } 
} 
  
class Sample1 { 
    public static void main (String[] args) { 
          
        // Access the static method disp() of Demo class
       Demo d = new Demo();
      d.disp();
    } 
} 
