//  Complete and execute java program to create Employee objects.

//Creating a class which contains the main method 
class Sample1 {

	public static void main(String args[]) {

	//Write code here to create three Employee objects,assign value to their attributes and print the 				//details for all the objects by calling the method for each object in Employee class
Employee e1 = new Employee();
    e1.empid= 1;
    e1.name= "bhargav";
    e1.salary= 40000;
    e1.printDetails();
    Employee e2 = new Employee();
    e2.empid=25;
    e2.name="neeraj";
    e2.salary=25000;
    e2.printDetails();
    Employee e3 = new Employee();
    e3.empid=99;
    e3.name="sundar";
    e3.salary=30000;
    e3.printDetails();
    
	}
}
	
//Creating Employee class
class Employee {  
	int empid;  
	String name; 
	double salary;

	void printDetails() {
	// print attributes here
System.out.println(empid+ " "+name+" "+salary );
	 }
}  

		    
