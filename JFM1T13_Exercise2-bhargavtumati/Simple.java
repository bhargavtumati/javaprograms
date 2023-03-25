// Objective of this java program is to sort an ArrayList containing user-defined objects

import java.util.ArrayList;
import java.util.Collections; 

public class Simple {

    public static void main(String args[]){  

      //Here we accessing Class objects in Student.java and NameComparator.java
      //Here we have an ArrayList containing Student type objects.
        ArrayList<Student> al=new ArrayList<Student>();  

      //Now what if we want to sort this ArrayList in ascending order of say names of the Student or their age.
      //Let's try sorting these objects in ascending order of names.
        al.add(new Student(101,"Vijay",23));  
        al.add(new Student(106,"Ajay",27));  
        al.add(new Student(105,"Jai",21));  
        System.out.println("Sorting by Name...");  
        Collections.sort(al,new NameComparator());  

       //Now's cast these objects into Student type.
        for(Student st: al){  
        System.out.println(st.rollno+" "+st.name+" "+st.age);  
        }        
    }  
}  

