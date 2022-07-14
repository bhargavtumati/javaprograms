// Complete and execute java Program for making a simple calculator using switch case
class Sample2{

	public static void main(String args[]) {

    		//Intialize the char variable below with operators (+, -, *, /) one by one and check the output
    		char operator = '-';
    		
		int first=10,second=5,result;

    		switch(operator) {
      		case '+':
        	//Write code to perform addition of first and second
           result=first+second;
            System.out.println(first + " " + operator + " " + second + " = " +result);
            break;
      		case '-':
        	//Write code to perform subtraction 
result=first-second;
            System.out.println(first + " " + operator + " " + second + " = " +result);
           break;
      		case '*':
        	//Write code to perform multiplication
result=first*second;
            System.out.println(first + " " + operator + " " + second + " = " +result);
           break;
      		case '/':
        	//Write code to perform division
result=first/second;
            System.out.println(first + " " + operator + " " + second + " = " +result);
           break;
      		//If operator doesn't match any case constant (+, -, *, /)
      		default:
        	// Print Error stating operator is not correct
            System.out.println("operator is not correct");
    		}

    		
  	}
}
