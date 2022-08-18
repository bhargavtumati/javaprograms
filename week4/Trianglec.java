//Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class named 'Triangle' with constructor having the three sides as its parameters.
class Trianglec{
  int a,b,c;
  Trianglec(int l,int m,int n){
    a=l;
    b=m;
    c=n;
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
    Trianglec obj=new Trianglec(3,4,5);
    System.out.println(obj.area());
    System.out.println(obj.perimeter());
  }
}