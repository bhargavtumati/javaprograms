//package aarogya_hospital;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;
import java.util.*;

class InvalidAadhaarNumberException extends Exception{
  InvalidAadhaarNumberException(String s){
    super(s);
  }
}
class InvalidMobileNumberException extends Exception{
  InvalidMobileNumberException(String s){
    super(s);
  }
}

// the main class
public class AarogyaHospital{

	
        // class for storing the patient information
	class AarogyaMember{
          // declare all the details for the patient including name, age, gender, Aadhar Card number, contact number, city, address, date of admission, guardian name, guardian address, guardian contact number
	String name, date_of_admission,address, guardian_name,guardian_address,city ;
    int age,unique_id=0;
    char gender;
    long aadhar_number,contact_number,guardian_mobile;
    boolean recovery;
	    // make constructor for the class and assign it a unique Id
	    public AarogyaMember(){
	    	unique_id++;
        recovery = false;
	    }
    	    // for taking patient information
	    public void input(){
	    	System.out.println("enter patient's name");
        Scanner ip=new Scanner(System.in);
        name=ip.nextLine();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        date_of_admission=dtf.format(now);
        System.out.println("enter gender of patient");
        gender=ip.next().charAt(0);
        System.out.println("enter age of patient");
      age=ip.nextInt();
        System.out.println("enter aadhar number of patient");
        try{
      aadhar_number=ip.nextLong(); if(aadhar_number>999999999999l||aadhar_number<100000000000l)
            throw new InvalidAadhaarNumberException("invalid aadhaar number");
        }
        catch(Exception e){
          System.out.println(e);
        }
        System.out.println("enter city of patient");
        city=ip.next();
        System.out.println("enter contact number of patient");
      
        try{
          contact_number=ip.nextLong();
if(contact_number<6000000000l||contact_number>9999999999l)
          throw new InvalidMobileNumberException("invalid mobile number");
        }
        catch(Exception e){
          System.out.println(e);
        }
        System.out.println("enter patient address");
        ip.nextLine();
        address=ip.nextLine();
        System.out.println("enter guardian name");
     guardian_name=ip.nextLine();
        System.out.println("enter guardian address");
      guardian_address=ip.nextLine();
        System.out.println("enter guardian mobile number");
      guardian_mobile=ip.nextLong();
    System.out.println("Patient details added Succesfully!\n\n");
      }
	}
static void displayDetails(AarogyaHospital.AarogyaMember patient)
  {
    System.out.println("-------Patient Details-------");
    System.out.println(" ID: "+patient.unique_id);
    System.out.println(" Name: "+patient.name);
    System.out.println(" Age: "+patient.age);
    System.out.println(" Gender: "+patient.gender);
    System.out.println(" Contact No.: "+patient.contact_number);
    System.out.println(" Patient lives in: "+patient.city);
    System.out.println(" Complete Address: "+patient.address);
    System.out.println(" Aadhar Number: "+patient.aadhar_number);
    System.out.println(" Date of Admission: "+patient.date_of_admission);
    System.out.println(" Guardian's Name: "+patient.guardian_name);
    System.out.println(" Guardian's Address: "+patient.guardian_address);
    System.out.println(" Guardian's Contact No.: "+patient.guardian_mobile+"\n\n");
  }

	// pick the choice of task to be performed
	static long choices(){
		System.out.println("Press 1 for adding new member");
		System.out.println("Press 2 to view list of all available members");
		System.out.println("Press 3 to search member by ID");
		System.out.println("Press 4 to search member from a particular city");
		System.out.println("Press 5 to search member from a particular age group");
		System.out.println("Press 6 to mark recovery of a member");
		System.out.println("Press 7 to delete data of a member");
		System.out.println("Press 0 to exit");
		Scanner ip=new Scanner(System.in);
            // create scanner class to take input
	    long option=ip.nextLong();
	    return option;
	}

	public static void main(String args[]){
		
		// initialise array list to store list of patients information
    AarogyaHospital ah=new AarogyaHospital();
		ArrayList<AarogyaMember> al=new ArrayList<>();
    Iterator <AarogyaMember> i;
    Scanner ip=new Scanner(System.in);
		//for adding aarogya member information
		while(true){

			//take choice
			long option=choices();
			
			//invalid choice
			if(option<0||option>7){
			System.out.println("invalid option");
			}
			// take the input and add in the arrayList
			else if(option==1){
        
	          AarogyaHospital.AarogyaMember am= ah.new AarogyaMember();
        am.input();
        al.add(am);
               }
			//iterate and print all the patients information
	       		 else if(option==2){
	     if(al.size()==0)
                 System.out.println("No Patient joined yet!\nPatient data is unavailable.\n\n");
               else
               {
                 i=al.iterator();
                 while(i.hasNext())
                   {
                     AarogyaHospital.AarogyaMember patient=i.next();
                     displayDetails(patient);
                   }
               }
             }
			// print details of the patient with a particular id (take id as input)
	                else if(option==3){
	            System.out.print("Enter the ID of the Patient: ");
                    int id = ip.nextInt();
                    int flag=0;
                    i= al.iterator();
                    while(i.hasNext())
                    {
                       AarogyaHospital.AarogyaMember patient = i.next();
                       if(patient.unique_id == id)
                       {
                          flag=1;
                          displayDetails(patient);
                      }
                    }
                    if(flag==0)
                      System.out.println("No Patient found with ID: "+id+"! \n\n");
                    }
	                
			
			// to print all the patients from a particular city (take city as input)
	                else if(option==4){
	        	System.out.print("Enter the City in which Patient Lives: ");
                    String city= ip.next();
                    int flag=0;
                    i= al.iterator();
                    while(i.hasNext())
                    {
                       AarogyaHospital.AarogyaMember patient = i.next();
                       if(patient.city.equals(city))
                       {
                          flag=1;
                          displayDetails(patient);
                      }
                    }
                    if(flag==0)
                      System.out.println("No Patient found with city: "+city+"! \n\n");
	               }
                  
			// to print details of all the patients in a particular age group (take age limits as input)
	               else if(option==5){
	             System.out.print("Enter the Age limits:\nEnter Lower Limit: ");
                    int ll= ip.nextInt();
                    System.out.print("\nEnter Upper Limit: ");
                    int ul= ip.nextInt();
                    int flag=0;
                    i= al.iterator();
                    while(i.hasNext())
                    {
                       AarogyaHospital.AarogyaMember patient = i.next();
                       if(patient.age>=ll && patient.age<=ul)
                       {
                          flag=1;
                          displayDetails(patient);
                      }
                    }
                    if(flag==0)
                      System.out.println("No Patients found with Age in the range of: "+ll+" and "+ul+"! \n\n");
	               }
	              
	              // take member id as input to maintain recovered information of patient
	               else if(option==6){
                  System.out.print("Enter the ID of the Patient: ");
                    int id = ip.nextInt();
                    int flag=0;
                    i= al.iterator();
                    while(i.hasNext())
                    {
                       AarogyaHospital.AarogyaMember patient = i.next();
                       if(patient.unique_id == id)
                       {
                          flag=1;
                           if(!patient.recovery)
                           {
                               patient.recovery = true;
                               System.out.println("Patient "+patient.name+" has been marked as recovered!\n\n");
                            }
                     else 
                             System.out.println("This Patient already marked as recovered!\n\n");
                       }
                    }
                    if(flag==0)
                      System.out.println("No Patient found with ID: "+id+"! \n\n");
	              }
                   
	              //take member id as input to delete patient information
	              else if(option==7){
			     int index=0;
                    int flag=0;
                    System.out.println("Enter the ID of the Patient : ");
                    int id = ip.nextInt();
                    i= al.iterator();
                    while(i.hasNext())
                    {
                         AarogyaHospital.AarogyaMember patient = i.next();
                        if(patient.unique_id == id){
                              flag=1;
                              break;
                           }
                    index++;
                   }
                    if(flag==0) 
                      System.out.println("No Patient found with ID: "+id+"! \n\n");
                  else 
                    {
                      al.remove(index);
                      System.out.println("Patient Details are deleted Successfully!\n\n");
	              }
                }
	              else{
	             break;
	             }
		}
	}
}
