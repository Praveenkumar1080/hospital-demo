package com.cg.hms.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.hms.Entity.Procedures;
import com.cg.hms.repository.AffiliatedwithRepository;
import com.cg.hms.repository.ProcedureRepository;

@Service
public class ProcedureServiceImpl implements ProcedureService{
	
	private ProcedureRepository procedureRepository;
	
	@Autowired
	public void ProcedureService( ProcedureRepository procedureRepository){
		this.procedureRepository=procedureRepository;
	}

	@Override
	public Procedures saveProcedure(Procedures procedure) {
	return procedureRepository.save(procedure);
		
	}

	@Override
	public List<Procedures> getAllProcedures() {
		
		return procedureRepository.findAll();
	}

	@Override
	public Procedures getCostOfProcedureById(Integer id) {
		return procedureRepository.findById(id).get();
		
	}

	@Override
	public List<Procedures> getCostOfProcedureByName(String name) {
		List<Procedures> procedure = procedureRepository.findByName(name);
		return procedure;
	}

	@Override
	public Procedures updateCostOfProcedure(Integer id,Procedures pd) {
		Procedures procedure=procedureRepository.findById(id).get();
		if(procedure != null) {
			 procedure.setCost(pd.getCost());
			 Procedures obj = procedureRepository.save(procedure);
			 return obj;
		}
		return null;
		
	}

	@Override
	public Procedures updateNameOfProcedureB(Integer procedureId, Procedures pd) {
		Procedures procedure=procedureRepository.findById(procedureId).get();
		if(procedure != null) {
			 procedure.setName(pd.getName());
			 Procedures obj = procedureRepository.save(procedure);
			 return obj;
		}
		return null;
	}

}
