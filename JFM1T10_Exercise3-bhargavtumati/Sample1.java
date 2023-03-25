//Complete and execute this java program of interface

interface Bank{  
float rateOfInterest();  
}  
class SBI implements Bank{  
 public float rateOfInterest(){
 float rate= 13.5f;  
 return rate;}
}  
class ICICI implements Bank{  
 public float rateOfInterest(){
   float rate= 12.3f;
   return rate;
 }
}  
 


class Sample1 {
  public static void main(String[] args) {
	Bank b=new SBI();
	System.out.println("ROI: "+b.rateOfInterest());
    Bank c=new ICICI();
      System.out.println("ROI: "+c.rateOfInterest());
    }
  }
