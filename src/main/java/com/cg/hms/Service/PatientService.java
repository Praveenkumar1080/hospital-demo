package com.cg.hms.Service;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder.In;

import org.springframework.stereotype.Service;

import com.cg.hms.Entity.Patient;

@Service
public interface PatientService {
	
	public Patient addPatientReport(Patient report);
	public List<Patient> getallPatients();
	public List<Patient> getParticularPhysicians(Integer pid);
	public Patient getParticularPatient(Integer physicianid,Integer ssn);
	public Integer getInsuranceOfPatient(Integer patientid);
	public Patient updateAddressOfPatient(Integer ssn,Patient patient);
	public Patient updatePhoneOfPatient(Integer ssn,Patient patient);
	Patient getParticularPhysician(Integer physicianid, Integer ssn);
	

}
