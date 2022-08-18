/* Write a program to print the following right angle traingle pattern:
1
22
333
4444
55555
*/
class Exercise2 {

	public static void main(String args[]) {
int i,k;
    //outer loop for rows
    for (i=1;i<=5;i++){
      for(k=1;k<=i;k++){
        System.out.print(i);
      }
      System.out.println();
    }
	}

}