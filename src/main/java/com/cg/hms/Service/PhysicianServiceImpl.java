package com.cg.hms.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.hms.Entity.Physician;
import com.cg.hms.repository.PhysicianRepository;

@Service
public class PhysicianServiceImpl implements PhysicianService  {
	
	private PhysicianRepository physicianRepository;
	
	@Autowired
	public void setPhysicianRepository(PhysicianRepository physicianRepository) {
		this.physicianRepository = physicianRepository;
	}

	@Override
	public Physician savePhysician(Physician physician) {
		
		return physicianRepository.save(physician);
	}

	@Override
	public Physician getPhysicianDetailsByName(String name) {
		
		return physicianRepository.findAllByName(name);
	}

	@Override
	public List<Physician> getallPhysiciansByPositions(String position) {
		
		return physicianRepository.findByPosition(position);
	}

	@Override
	public Optional<Physician> getallPhysiciansByEmpid(Integer employeeid) {
		
		return physicianRepository.findById(employeeid);
	}

	@Override
	public Physician updatePositionOfPhysician(Integer employeeid, String newPosition) {
		Physician physician1=physicianRepository.findById(employeeid).orElseThrow(() -> new RuntimeException("physician not found with employeeid:" + employeeid));
		physician1.setPosition(newPosition);
		return physicianRepository.save(physician1);
		
	}

	@Override
	public Physician updateNameOfPhysician(Integer employeeid, String newName) {
		Physician physician1=physicianRepository.findById(employeeid).orElseThrow(() -> new RuntimeException("physician not found with employeeid:" + employeeid));
		physician1.setName(newName);
		return physicianRepository.save(physician1);
		
	}

	@Override
	public Physician updateSSNOfPhysician(Integer employeeid, Integer SSN) {
		Physician physician1=physicianRepository.findById(employeeid).orElseThrow(() -> new RuntimeException("physician not found with employeeid:" + employeeid));
		physician1.setSsn(SSN);
		return physicianRepository.save(physician1);
	}
	
	

}
