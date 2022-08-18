/*Write a java program to input electricity unit charges and calculate total     electricity bill according to the given condition:
    For first 50 units Rs. 0.50/unit
    For next 100 units Rs. 0.75/unit
    For next 100 units Rs. 1.20/unit
     For unit above 250 Rs. 1.50/unit
     An additional surcharge of 20% is added to the bill*/
import java.util.*;
class electricity{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter electricity units:");
    double units,current=0,cu;
      units=sc.nextDouble();
    if(units>250)
    { cu=units-250;
      current=1.5*cu;
    units-=cu;}
    if(units>150&&units<=250)
    {   cu=units-150;
    current=current+(cu*1.2);
    units-=cu;}
    if(units>50&&units<=150){
      cu=units-50;
      current+=(cu*0.75);
      units-=cu;}
      if(units>0&&units<=50){
        current+=(units*0.5);
      }
    current*=1.2;
    System.out.println("your electricity bill: "+current);
    }
  }
