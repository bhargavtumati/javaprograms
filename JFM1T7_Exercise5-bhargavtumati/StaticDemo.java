// Java Program to illustrate accessing static method of a class 

class Demo
{ 
    static final String COURSE_NAME = "Java"; 
      
    public static void courseDisp()
    { 
     System.out.println(COURSE_NAME);      
    } 
} 
  
class StaticDemo 
{ 
    public static void main (String[] args) 
    { 
          
        // Accessing the static method courseDisp() by class name itself. 
        Demo.courseDisp(); 
    } 
} 