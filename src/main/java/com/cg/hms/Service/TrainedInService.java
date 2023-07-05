package com.cg.hms.Service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.hms.Entity.Physician;
import com.cg.hms.Entity.Procedures;
import com.cg.hms.Entity.Trainedin;

@Service
public interface TrainedInService {
	
	
	public void getCertification(int physicianId, int treatmentId, LocalDateTime certificationDate, LocalDateTime certificationExpires); 
	public List<Procedures> getProceduresWithCertification();
	public List<Procedures> getTreatmentsByPhysicianId(int physicianId);
	public List<Physician> getPhysiciansByTreatmentId(int treatmentId);
	public List<Procedures> getProceduresWithExpiringCertification();
	public boolean updateCertificationExpiryDate(int physicianId, int procedureId, LocalDateTime newExpiryDate);
	

}
