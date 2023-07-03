package com.cg.hms.Service;

import java.util.List;


import org.springframework.stereotype.Service;


import com.cg.hms.Entity.Procedures;

@Service
public interface ProcedureService {
	
	public Procedures saveProcedure(Procedures procedure);
	public List<Procedures> getAllProcedures(Integer code);
	public Procedures getCostOfProcedureById();
	public Procedures getCostOfProcedureByName();
	public Procedures updateCostOfProcedure(Procedures procedure);
	public Procedures updateNameOfProcedureB(Procedures procedure);

}
