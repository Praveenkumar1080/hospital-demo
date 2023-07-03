package com.cg.hms.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.hms.Entity.Procedure;

@Service
public interface ProcedureService {
	
	public Procedure saveProcedure(Procedure procedure);
	public List<Procedure> getAllProcedures(Integer code);
	public Procedure getCostOfProcedureById();
	public Procedure getCostOfProcedureByName();
	public Procedure updateCostOfProcedure(Procedure procedure);
	public Procedure updateNameOfProcedureB(Procedure procedure);

}
