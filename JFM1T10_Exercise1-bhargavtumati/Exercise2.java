//Write a program to override one method of Bike class in each of it's child class
class Bike {
void print(){
  System.out.println("Hero");
}

}
class MountainBike extends Bike {
void print(){
  System.out.println("MountainBike");
}
}
class TandemBike extends Bike {
  void print(){
    System.out.println("TademBike");
  }
}


class Exercise2 {
  public static void main(String[] args) {
    Bike obj1=new Bike();
    Bike obj2=new MountainBike();
    TandemBike obj3=new TandemBike();
    obj1.print();
    obj2.print();
    obj3.print();
    
  }
}