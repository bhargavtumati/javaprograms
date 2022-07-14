//Write a java program to check whether a year is leap year or not.
import java.util.*;
public class leapyear{
  public static void main(String[] args){
    int y;
    Scanner s=new Scanner(System.in);
  System.out.println("Enter year");
    y=s.nextInt();
if(y%400==0||y%4==0&&y%100!=0)//https://airandspace.si.edu/stories/editorial/science-leap-year#:~:text=The%20rule%20is%20that%20if,skipped%20is%20the%20year%202100.
      System.out.println("leap year");
    else
      System.out.println("not leap year");
  }
}
//By adding an extra day every four years, our calendar years stay adjusted to the sidereal year, but that’s not quite right either. Some simple math will show that over four years the difference between the calendar years and the sidereal year is not exactly 24 hours. Instead, it’s 23.262222 hours. Rounding strikes again! By adding a leap day every four years, we actually make the calendar longer by over 44 minutes. Over time, these extra 44+ minutes would also cause the seasons to drift in our calendar. For this reason, not every four years is a leap year.  The rule is that if the year is divisible by 100 and not divisible by 400, leap year is skipped. The year 2000 was a leap year, for example, but the years 1700, 1800, and 1900 were not.  The next time a leap year will be skipped is the year 2100.  