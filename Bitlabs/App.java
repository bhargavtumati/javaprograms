package com.bitlabs.AarogyasriHospital;

import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    	
    	Scanner sc=new Scanner(System.in);
    	DaoInterface dao=new DaoImpl();
	    Patient p=new Patient();
    	System.out.println("1 enter patient details");
    	System.out.println("2 view all apatients");
    	System.out.println("3 delete patrient record");
    	System.out.println("4 update patient info");
    	System.out.println("5 view patient by id");
    	System.out.println("6 add medicine details");
		int option=sc.nextInt();
		switch (option) {
		case 1:
			
		    System.out.println("enter id");
		    p.setPid(sc.nextInt());
		    System.out.println("enter name");
		    sc.nextLine();
		    p.setPname(sc.nextLine());
		    System.out.println("enter age");
		    p.setAge(sc.nextInt());
		    System.out.println("enter city");
		    p.setCity(sc.next());
		    System.out.println("enter mobile");
		    p.setMobile(sc.nextLong()); 
		    
		    dao.patientRegistration(p);
		break;
    	
		case 2:

    	    dao.viewAllPatients();
    	break;
		case 3:
			System.out.println("enter id");
    	    p.setPid(sc.nextInt());
    	    dao.deletePetientById(p.getPid());
    	break;
		case 4:
			System.out.println("enter name");
			sc.nextLine();
    	    p.setPname(sc.nextLine());
    	    System.out.println("enter age");
    	    p.setAge(sc.nextInt());
    	    System.out.println("enter id");
    	    p.setPid(sc.nextInt());
    	    dao.updatePetientInfo(p);
    	break;
		case 5:
			System.out.println("enter id");
			p.setPid(sc.nextInt());
    	    dao.getPatientById(p.getPid());
        break;
		case 6:
			Medicine m=new Medicine();
			System.out.println("enter medicine id");
			m.setMid(sc.nextInt());
			System.out.println("enter medicine name");
			m.setMname(sc.next());
			System.out.println("enter medicine rate");
			m.setRate(sc.nextInt());
			System.out.println("enter count");
			m.setMcount(sc.nextInt());
			dao.addingMedicalRecords(m);
    }
}
}