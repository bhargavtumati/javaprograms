/* JFM1T9_Assignment4:
     Extend and enhance the previous inheritance program where collegeName, designation and 
     work() method are common to all the teachers and declared in the base class in the way
     that all child classes like MathTeacher, EnglishTeacher and MusicTeacher do not need to 
     write this code and can use directly from base class. 

     Sample Output:
     Math Teacher         IIT
     English Teacher      IIT
     Music Teacher        IIT
*/
class Teacher{
String CollegeName="IIT";
  String designation="Teacher";
  void work(){
    System.out.println(designation+" "+CollegeName);
  }
}
//Add Teacher class
class MathTeacher extends Teacher{
  String Subject1="Maths";
}

//Add MathTeacher class
class EnglishTeacher extends MathTeacher{
  String Subject2="English";
}
//Add EnglishTeacher class
class MusicTeacher extends EnglishTeacher{
  String Subject3="Music";
}

class CollegePrincipal {
public static void main(String args[]){
  MusicTeacher obj=new MusicTeacher();
//Add the main method here and create all different types of Teacher objects and print there college name designation.

System.out.print(obj.Subject1);
  obj.work();
  System.out.print(obj.Subject2);
  obj.work();
  System.out.print(obj.Subject3);
  obj.work();

}
}
