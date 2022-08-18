/* Write a program to print the following equilateral traingle pattern:
   *
  ***
 *****
*******

*/
class Exercise4 {

	public static void main(String args[]) {
int x,y,rows;
    rows=4;
    
    
    for(x=1; x<=rows; x++)
    {
        // Print spaces
        for(y=x; y<=rows; y++)
        {
           System.out.print(" ");
        }
        // Print star/
        for(y =1; y<=((2*x)-1); y++)
        {
           System.out.print("*");
        }
        // Print new line
        System.out.println("");
      }
	}

}