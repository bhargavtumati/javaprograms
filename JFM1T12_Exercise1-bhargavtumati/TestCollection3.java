// Objective of this java program is to understand an arraylist of user defined objects

import java.util.ArrayList;
import java.util.Iterator;

    public class TestCollection3 {  

     	public static void main(String args[]) {  

      	//Creating user-defined class objects  
      	//Here accessing Student class from another file Student.java and creating it's objects
      	//We have a Student class having instance members and a paramterized constructor to initialize its instance variables
      	//In this class first let's create three Student objects and calling its constructor 
      	Student s1=new Student(101,"Sonoo",23);  
      	Student s2=new Student(102,"Ravi",21);  
      	Student s3=new Student(103,"Hanumat",25);  
         
      	//Now let's create an arraylist of Student type and add all Student objects to it 
      	ArrayList<Student> al=new ArrayList<Student>();

      	//Adding Student class objects  
      	al.add(s1);
      	al.add(s2);  
      	al.add(s3);  
        
      	//Using iterator to traverse elements. Since iterator stores them as generalized Objects, 
      	//lets cast each object to  Student type and access the instance variables for each Student object.
      	Iterator itr=al.iterator();  

      	//Traversing objects
      	while(itr.hasNext())
	   {  
              Student str=(Student)itr.next();  
              System.out.println(str.rollno+" "+str.name+" "+str.age);  
      	   }  
       }  
  }  

