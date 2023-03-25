//Complete and execute this java program illustrating access specifiers

class Data {
    private String name;

    // create a getter method for name field
    void getAtt(){
      System.out.println(name);
    }
    // create a setter method for name field
    void setAtt(String a){
      name=a;
    }
}
public class Sample1{
    public static void main(String[] main){
        Data d = new Data();
d.setAtt("bhargav");
      d.getAtt();
        // access the private variable using the getter and setter
        
    }
}