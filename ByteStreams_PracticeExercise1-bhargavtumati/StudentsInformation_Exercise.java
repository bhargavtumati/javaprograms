/*  9. Write a program to accept 3 student's information such as name, marks and mobile number and store into studentsinformation.txt file.

Sample Input: 
Enter student 1 information: 
Enter Name : Ravi
Enter Marks : 90
Enter Mobile number: 9999343323

Enter student 2 information: 
Enter Name : Surya
Enter Marks : 89
Enter Mobile number: 7893434333

Enter student 3 information: 
Enter Name : Kumar
Enter Marks : 55
Enter Mobile number: 9934223323


Expected Output: Your Information stored in file successfully.

Expected Output in file:
  Name  Marks   Mobile number
  Ravi   90      9999343323
  Surya  89      7893434333
  Kumar  55      9934223323
*/
import java.util.*;
import java.io.*;
public class StudentsInformation_Exercise {
public static void main(String args[]){
Scanner sc=new Scanner (System.in);
  
      String Intro="name marks mobilenumber\n";
  
    String Name="";
  for(int i=1;i<4;i++){
    System.out.println("enter the deatails of student"+i);
      System.out.println("Enter name: ");
      Name+=(sc.nextLine()+" ");
      System.out.println("Enter Marks: ");
      Name+=(sc.nextLine()+" ");
      System.out.println("Enter mobile number: ");
      Name+=(sc.nextLine()+"\n");
  }
 
try{
      FileOutputStream fos=new FileOutputStream("studentsinformation.txt");
    fos.write(Intro.getBytes());
      fos.write(Name.getBytes());
      fos.close();
}
      catch(Exception e){
        System.out.println(e);
      }
  sc.close();

    }
}
