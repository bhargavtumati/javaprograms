//  Complete and execute java program to initialize Employee object using Constructor

class Sample1{  
int empid;  
String name; 
double salary;

//Default constructor
Sample1(){
//Initialize here
empid=1;
  name="bhargav";
    salary=40000;
}
 
//Method to display the value of id, name and salary  
void display(){
System.out.println(empid+" "+name+" "+salary);
}  
  
public static void main(String args[]){  
//Create object  
Sample1 emp1 =new Sample1();
//Display values of the object by calling the method  
emp1.display();
}  
}
		    
