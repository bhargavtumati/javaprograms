// Java Program to rebuild the Grade System using Switch-Case

public class SwitchDemo {
	public static void main(String args[]) {
		// Declaring and initializing marks variable.You can change marks and test your program again.
		int marks=82;
		// Dividing marks by 10 to limit the number of cases 
		marks=marks/10;
		// Enclosing marks in switch expression to check against matching case.
		
		switch(marks) {
		    
		    // More than one case may be written together if the under-statement is common
		    case 9:
		    case 8:
		    System.out.println("Grade=Excellent");
		    // Every case must be terminated by a break statement
		    break;
		    case 7:
			case 6:
			System.out.println("Grade=Very Good");
			break;
			case 5:
			System.out.println("Grade=Good");
			break;
			// default case is just like else with if i.e., optional
			default:
			System.out.println("Fail or Irrelevant Input");
		}
	}
}