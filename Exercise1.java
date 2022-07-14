// Write a program to print all odd numbers between 1 to 100 using 'continue'

class Exercise1 {

	public static void main(String args[]) {

int i=1;
    for(i=1;i<=100;i++)
      {
        if(i%2==0)
          continue;
        else
          System.out.println(i);
      }
	}

}