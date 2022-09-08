package com.bitlabs.AarogyasriHospital;

public interface DaoInterface {

	 public void patientRegistration(Patient p);
	public void addingMedicalRecords(Medicine m);
       public void viewAllPatients();
	   public void deletePetientById(int pid);
	   public void updatePetientInfo(Patient p);
	   public void getPatientById(int pid);
	 
	 
	 
}