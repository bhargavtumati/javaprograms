// Write a program to initialize a char variable and then store it in an int variable. Print the int variable's value on console.

class Exercise1 {
	public static void main(String args[]) {
   // create char variables
		char a = '5';
    char b = 'C';
// convert char variables to int
    // ASCII value of characters is assigned
    int num1 = Character.getNumericValue(a);
    int num2 = Character.getNumericValue(b);
// print the values
    System.out.println(num1);
    System.out.println(num2);
	}
}
