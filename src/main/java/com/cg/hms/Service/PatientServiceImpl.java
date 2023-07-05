package com.cg.hms.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.hms.Entity.Patient;
import com.cg.hms.Entity.Physician;
import com.cg.hms.repository.PatientRepository;
import com.cg.hms.repository.PhysicianRepository;

@Service
public class PatientServiceImpl implements PatientService{
	
	private PatientRepository patientRepository;
	private PhysicianRepository physicianRepository;
	
	@Autowired
	public void setPatientRepository(PatientRepository patientRepository) {
		this.patientRepository = patientRepository;
	}
	@Autowired
	public void setphysicianRepository(PhysicianRepository physicianRepository) {
		this.physicianRepository = physicianRepository;
	}

	@Override
	public Patient addPatientReport(Patient patient) {
	            return patientRepository.save(patient);
	        }
	@Override
	public List<Patient> getallPatients() {
		return patientRepository.findAll();
	}

	@Override
	public List<Patient> getParticularPhysicians(Integer physicianid) {
		Physician phy = physicianRepository.findById(physicianid).get();
		return patientRepository.findByPcp(phy);
	}

	@Override
	public Patient getParticularPatient(Integer physicianid,Integer ssn) {
		Patient patient= null;
		Physician phy = physicianRepository.findById(physicianid).get();
		List<Patient> lis = patientRepository.findByPcp(phy);
		for(Patient p:lis) {
			if(p.getSsn()==ssn) {
				patient = p;
			}
		}
		return patient;
	}

	@Override
	public Integer getInsuranceOfPatient(Integer patientid) {
		Patient patient = patientRepository.findById(patientid).get();
        if (patient != null) {
            return patient.getInsuranceid();
        }
        return -1; 
    }
	

	@Override
	public Patient updateAddressOfPatient(Integer ssn,Patient patient) {
		 Patient pat = null;
		 Patient patient1 = patientRepository.findById(ssn).get();
	        if (patient != null) {
	            patient1.setAddress(patient.getAddress());
	            pat = patientRepository.save(patient1);
	        }
	        return pat; 
	    }


	@Override
	public Patient updatePhoneOfPatient(Integer ssn,Patient patient) {
		 Patient pat = null;
		 Patient patient1 = patientRepository.findById(ssn).get();
	        if (patient != null) {
	            patient1.setPhone(patient.getPhone());
	            patient = patientRepository.save(patient1);
	        } 
	        return pat;
	    }
	@Override
	public Patient getParticularPhysician(Integer physicianid, Integer ssn) {
		// TODO Auto-generated method stub
		return null;
	}
}
	


