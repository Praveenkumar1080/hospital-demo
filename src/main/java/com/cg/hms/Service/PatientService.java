package com.cg.hms.Service;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder.In;

import org.springframework.stereotype.Service;

import com.cg.hms.Entity.Patient;

@Service
public interface PatientService {
	
	public Patient savePatient(Patient patient);
	public List<Patient> getallPatients(Integer ssn);
	public List<Patient> getParticularPhysicians(Integer employeeid,Integer ssn);
	public Patient getParticularPhysician(Integer employeeid,Integer ssn);
	public Patient getInsuranceOfPatient();
	public Patient updateAddressOfPatient(Integer ssn,Patient patient);
	public Patient updatePhoneOfPatient(Integer ssn,Patient patient);
	

}
