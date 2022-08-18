//wap to define this example
class thisexample{
  int a;
  int b;
thisexample(int a,int b)
  {
    this.a=a;
    this.b=b;
  }
  int add()
  {
    this.display();//compiler automatically adds 'this'
   return (a+b); 
  }
void display()
  {
    System.out.println(a);
    System.out.println(b);
  }
public static void main(String args[]){
  thisexample obj=new thisexample(9,10);
  thisexample obj2=new thisexample(11,20);
  
  System.out.println(obj2.add());
 
}
}