// Java Program to demonstrate Encapsulation or Data binding
class Employee {
        private String empName;
	    private int empAge;

	    //Getter and Setter methods
        public String getEmpName() {
	        return empName;
	    }

	    public int getEmpAge() {
	        return empAge;
	    }

	    public void setEmpAge(int newValue) {
	        empAge = newValue;
	    }

	    public void setEmpName(String newValue){
	        empName = newValue;
	    }
	}
	public class EncapsulationTest{
	    public static void main(String args[]){
	         Employee obj = new Employee();
	         obj.setEmpName("Mario");
	         obj.setEmpAge(32);
	         System.out.println("Employee Name: " + obj.getEmpName());
	         System.out.println("Employee Age: " + obj.getEmpAge());
	    } 
	}
/* Objective of this program is to demonstrate Encapsulation or Data binding.
Let's create a class Employee and two private data members  private String empName; and private int empAge;
We are declaring these variables private to restrict their direct access outside this class. These data members will be accessed  by other classes via public setter and getter methods.
Now, let's create their public setter and getter methods. As the name indicates setter method is used to set value and getter method to access value of data member
No other class can directly access and modify the private data members, only the same class can. This enhances data security.
Here EncapsulationTest is the main class that is accessing setter methods of Employee class to set values in data members of Employee class.
Similarly, calling getter methods to access or print the data member values in console.
*/ 