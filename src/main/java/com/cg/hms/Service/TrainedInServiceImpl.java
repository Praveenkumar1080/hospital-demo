/*package com.cg.hms.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.hms.Entity.Physician;
import com.cg.hms.Entity.Procedures;
import com.cg.hms.Entity.Trainedin;
import com.cg.hms.repository.TrainedinRepository;

@Service
public class TrainedInServiceImpl implements TrainedInService {
	
	private TrainedinRepository trainedinRepository;
	
	@Autowired
	public void setTrainedinRepository(TrainedinRepository trainedinRepository) {
		this.trainedinRepository = trainedinRepository;
	}

	

	@Override
	public List<Procedures> getProceduresWithCertification() {
		return trainedinRepository.getProceduresWithCertification();
		
	}

	@Override
	public List<Procedures> getTreatmentsByPhysicianId(int physicianId) {
		return trainedinRepository.findTreatmentsByPhysicianId(physicianId);
	}

	@Override
	public List<Physician> getPhysiciansByTreatmentId(int treatmentId) {
		return trainedinRepository.findPhysiciansByTreatmentId(treatmentId);
		
	}

	@Override
	public List<Procedures> getProceduresWithExpiringCertification() {
		LocalDate now = LocalDate.now();
        LocalDate expiryDate = now.plusMonths(1);
        return trainedinRepository.findProceduresWithCertificationExpiringWithin(expiryDate);
	}

	@Override
	public boolean updateCertificationExpiryDate(int physicianId, int procedureId, LocalDateTime newExpiryDate) {
		 Trainedin trainedIn = trainedinRepository.findByPhysicianIdAndProcedureId(physicianId, procedureId);
	        if (trainedIn != null) {
	            trainedIn.setCertificationexpires(newExpiryDate);
	            trainedinRepository.save(trainedIn);
	            return true;
	        }
	        return false;
	    }
}*/
