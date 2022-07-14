//Write a java program to check whether a number is Armstrong number or not.
import java.util.*;
public class armstrongno {
    public static void main(String[] args) {
        int number, temp, remainder, result = 0, n = 0;
System.out.println("Enter number");
      Scanner sc=new Scanner(System.in);
      number=sc.nextInt();
        temp = number;
        for (;temp != 0; temp /= 10, ++n);//calculating no of digits
        temp = number;//checking armstrong number or not
        for (;temp != 0; temp /= 10)
        {
            remainder = temp % 10;
            result += Math.pow(remainder, n);
        }
        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}