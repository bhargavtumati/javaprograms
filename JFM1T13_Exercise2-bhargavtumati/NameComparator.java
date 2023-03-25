import java.util.*;
import java.util.Comparator; 
//Comparator interface in java.util package allows sorting to sort elements in user defined fashion for user defined type collections.

//Let's create a separate class that implements Comparator interface and specifies the basis of sorting. 
//Let's name this class as NameComparator as we are going to sort by names of students.
class NameComparator implements Comparator<Object>  {
  

   //Let's override compare method that take two objects as arguments and compares them. 
    public int compare(Object o1,Object o2) {  

   // Here we accessing class objects in Student.java
    Student s1=(Student)o1;  
    Student s2=(Student)o2;  

   //To compare two student objects at a time on the basis of their name, let's use compareTo() method of   
   //String that comapares two strings lexicographically i.e.,comparing first alphabet of both strings and returning the  difference of  
   //their unicodes.Collections.sort uses comaparator reference and sorts the list based on the logic written in its compare method.
    return s1.name.compareTo(s2.name);  
    }
  public static void main(String args[]){
    ArrayList<Student> al=new ArrayList<>();
    al.add(new Student(101,"bhargav",28));
    al.add(new Student(102,"vamsi",27));
    al.add(new Student(103,"sai",27));
  Collections.sort(al,new NameComparator());
    for(Student s:al){
      System.err.println(s.name+" "+s.rollno+" "+s.age);
    }
}
}


