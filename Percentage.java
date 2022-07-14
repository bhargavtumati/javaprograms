/*Write a java program to input marks of five subjects Physics, Chemistry, Biology,     Mathematics and Computer. Calculate percentage and grade according to     following:
    Percentage >= 90% : Grade A
    Percentage >= 80% : Grade B
    Percentage >= 70% : Grade C
    Percentage >= 60% : Grade D
    Percentage >= 40% : Grade E
    Percentage < 40% : Grade F*/
import java.util.*;
class Percentage{
public static void main(String args[])  {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter marks of 5 subjects");
  float marks=0,p,total=500;
  for(int i=1;i<=5;i++)
      {
    marks +=sc.nextInt();
      }
      p=(marks/total)*100;
  if(p>=90)
System.out.println("A");
else if(p>=80&&p<90)
  System.out.println("B");
  else if(p>=70&&p<80)
  System.out.println("C");
  else if(p>=60&&p<70)
  System.out.println("D");
  else if(p>=40&&p<60)
  System.out.println("E");
  else if(p<40)
  System.out.println("F");
}
}