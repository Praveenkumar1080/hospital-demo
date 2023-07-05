package com.cg.hms.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cg.hms.Entity.Physician;

@Service
public interface PhysicianService {
	
	
	public Physician savePhysician(Physician physician);
	public Physician getPhysicianDetailsByName(String name);
	public List<Physician>  getallPhysiciansByPositions(String position);
	public Physician  getPhysicianByEmpid(Integer employeeid);
	public Physician updatePositionOfPhysician(Integer employeeid,Physician physician);
	public Physician updateNameOfPhysician(Integer employeeid,Physician physician);
	public Physician updateSSNOfPhysician(Integer employeeid,Physician physician);

	
	
	
	

}
