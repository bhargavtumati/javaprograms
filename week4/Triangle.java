//Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class named 'Triangle' without any parameter in its constructor.
class Triangle{
  int a,b,c;
  Triangle(){
    a=3;
    b=4;
    c=5;
  }
  double area(){
   double p=(a+b+c)/2;
    return Math.sqrt(p*(p-a)*(p-b)*(p-c));
  }
  int perimeter(){
    int per=a+b+c;
    return per;
  }
  public static void main(String args[]){
    Triangle obj=new Triangle();
    System.out.println(obj.area());
    System.out.println(obj.perimeter());
  }
}