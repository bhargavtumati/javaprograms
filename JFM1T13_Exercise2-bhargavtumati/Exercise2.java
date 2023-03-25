// Write a java program to sort Student records(take 3-4 students data) in ascending order of their marks using Comparator reference.
import java.util.*;

class Exercise2{
public static void main(String args[]){
  ArrayList<Student> al=new ArrayList<>();
  al.add(new Student(101,"bhargav",28));
  al.add(new Student(102,"madhav",27));
  al.add(new Student(103,"ganesh",28));
  Comparator<Student> c=new Comparator<>(){
    public int compare(Student s,Student m){
      return s.name.compareTo(m.name);
    }
  };
  Collections.sort(al,c);
  for(Student i:al){
    System.out.println(i.name+" "+i.rollno+" "+i.age);
  }
  
}


}