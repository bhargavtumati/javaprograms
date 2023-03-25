//Complete this java program to demonstrate working of Comparator interface and Collections.sort() to sort according to user defined criteria.
 
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
// A class to represent a student. 
class Student { 
    int rollno; 
    String name, address; 
  
    // Constructor 
    public Student(int rollno, String name, 
                               String address) { 
        this.rollno = rollno; 
        this.name = name; 
        this.address = address; 
    } 
  
    // Used to print student details in main() 
    public String toString() { 
        return this.rollno + " " + this.name + 
                           " " + this.address; 
    } 
} 
  
class Sortbyroll implements Comparator<Student> { 
    // Write code to sort Student objects in ascending order of rollno
  public int compare(Student d,Student g){
    return d.rollno-g.rollno;
  }
} 
  
// Driver class 
class Sample2 { 
    public static void main (String[] args) { 
        ArrayList<Student> ar = new ArrayList<Student>(); 
        // Add 3 Student objects in ArrayList
      ar.add(new Student(25,"bhargav","vijayawada"));
      ar.add(new Student(16,"krishna","guntur"));
      ar.add(new Student(17,"vijay","hyderabad"));
  
        System.out.println("Unsorted"); 
        for (int i=0; i<ar.size(); i++) 
            System.out.println(ar.get(i)); 
  
        Collections.sort(ar, new Sortbyroll()); 
  
        System.out.println("\nSorted by rollno"); 
        for (int i=0; i<ar.size(); i++) 
            System.out.println(ar.get(i)); 
    } 
} 
