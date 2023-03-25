


/*  JFM1T13_Assignment4: 

      Write a program to create a class HDTV with the properties: 
         •	Brandname 
         •	Size 
      Create another class having an ArrayList and add 3 objects of HDTV into it. Display HDTV objects in sorted order of size.(Use Comparator) 

     Sample Output:
     4000 Sony 20
     2000 LG 26
     3000 MI 27
     1000 Samsung 28
*/

import java.util.*;
public class HdTvStock {

//main method
public static void main(String args[]){
//create HdTv class object in arraylist
List<HDTV> obj=new ArrayList<>();
//add elements to that arraylist
  obj.add(new HDTV("LG",26));
  obj.add(new HDTV("Sony",20));
  obj.add(new HDTV("MI",27));
  obj.add(new HDTV("Samsung",28));

//print values on sorted order based on size value
Collections.sort(obj,new BrandnameComparator());
//use collection.sort and pass Brandname Comparator as parameters
for(HDTV h:obj)
  System.out.println(h.brandname+" "+h.size);
//print result
}
}
//create HdTv class in that declare variables and pass variables as parameters
class HDTV{
  String brandname;
  int size;
  HDTV(String brandname,int size){
    this.brandname=brandname;
    this.size=size;
  }
}

//create BrandnameComparator it implements Comparator in that create a compare method pass two parameters for comparing sizes
  
class BrandnameComparator implements Comparator<HDTV>{
//access HdTv class objects
public int compare(HDTV h1,HDTV h2){
//compare sizes and return size
 return h1.size-h2.size;
}
}
