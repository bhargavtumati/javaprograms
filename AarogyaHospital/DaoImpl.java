package com.bitlabs.AarogyasriHospital;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;



public class DaoImpl implements DaoInterface {

	Connection con=null;
	
	public DaoImpl() {
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	     con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bitlabs","root","sespl!@3");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	
	public void patientRegistration(Patient p) {
		
		if(con!=null) {
			try {
			PreparedStatement pstmt=con.prepareStatement("insert into patient values(?,?,?,?,?)");
			pstmt.setInt(1, p.getPid());
			pstmt.setString(2,p.getPname());
			pstmt.setInt(3, p.getAge());
			pstmt.setString(4, p.getCity());
			pstmt.setLong(5,p.getMobile());
			
			
			int i=pstmt.executeUpdate();
			if(i!=0) {
				System.out.println("Patient details added successfully");
			}
			
			
			}
			catch(Exception e) {
				System.out.println(e);
			}
			}
	}
	public void addingMedicalRecords(Medicine m){
		try {
			PreparedStatement pstmt=con.prepareStatement("insert into medicine values(?,?,?,?)");
			pstmt.setInt(1, m.getMid());
			pstmt.setString(2,m.getMname());
			pstmt.setInt(3, m.getRate());
			pstmt.setLong(4,m.getMcount());
			
			int i=pstmt.executeUpdate();
			if(i!=0) {
				System.out.println("medicine details added successfully");
			}
			
			
			}
			catch(Exception e) {
				System.out.println(e);
			}
	}


	public void viewAllPatients() {
		
		try {
			
			Statement stmt=con.createStatement();
			
			// execute()             // select/ non select   -- > boolean
			// executeUpdate()       // non select  (insert/delete/udpate)   --> int
			// executeQuery()         // select    ----  > ResultSet
			
			ResultSet rs=stmt.executeQuery("select * from patient");
			while(rs.next()) {
			
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getLong(5));
				
			}
					
					
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}


	public void deletePetientById(int pid) {
		try {
			  Statement stmt=con.createStatement();
			  
			  int i=stmt.executeUpdate("delete from patient where id='"+pid+"'");
			  
			  if(i!=0) {
				  System.out.println("patient details deleted scucessfully");
			  }
		}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		
	


	public void updatePetientInfo(Patient p) {   // name and age from user
		
		try {
			
			Statement stmt=con.createStatement();
	         int i=stmt.executeUpdate("update patient set name='"+p.getPname()+"', age='"+p.getAge()+"' where id ='"+p.getPid()+"'");
	         
		   if(i!=0) {
			   System.out.println("Patient details updated successfully");
		   }
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}


	public void getPatientById(int pid) {
	
		try {
			
			Statement stmt=con.createStatement();
			
			ResultSet rs=stmt.executeQuery("select * from patient where id='"+pid+"'");
		      while(rs.next()) {
		    	  System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getLong(5));
		      }
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}