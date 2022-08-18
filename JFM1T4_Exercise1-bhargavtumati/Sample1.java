// Complete and execute java Program for checking the number of digits in a number
class Sample1 {

	public static void main(String args[]) {
		int num =1234;// you can also change the value to test the output
		
		if(num>9&&num<100)//Write Test condition1) {
	  		System.out.println("Its a two digit number");
		else if(num>99&&num<1000)//Write Test condition2) {
	  		System.out.println("Its a three digit number");
  else if(num>999&&num<10000)//Write Test condition3) {
	  		System.out.println("Its a four digit number");
		else if(num>9999&&num<100000)//Write Test condition4) {
	  		System.out.println("Its a five digit number");
		else
	  		System.out.println("number is not between 1 & 99999");
   	}
}
