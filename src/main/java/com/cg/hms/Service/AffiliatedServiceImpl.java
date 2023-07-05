/*package com.cg.hms.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.hms.Entity.Affiliatedwith;
import com.cg.hms.Entity.Department;
import com.cg.hms.Entity.Physician;
import com.cg.hms.repository.AffiliatedwithRepository;
import com.cg.hms.repository.DepartmentRepository;
import com.cg.hms.repository.PhysicianRepository;

@Service
public class AffiliatedServiceImpl implements AffiliatedService{
	
	public AffiliatedwithRepository affiliatedwithRepository;
	public PhysicianRepository physicianRepository;
	public DepartmentRepository departmentRepository;
	
	@Autowired
	public void PhysicianService(PhysicianRepository physicianRepository, AffiliatedwithRepository affiliatedwithRepository,DepartmentRepository departmentRepository) {
		this.physicianRepository=physicianRepository;
		this.affiliatedwithRepository=affiliatedwithRepository;
		this.departmentRepository=departmentRepository;
	}
	
	@Override
	public void saveAffiliatedwith() {
		Affiliatedwith object = new Affiliatedwith();
		Physician phy = physicianRepository.findById(1).get();
		object.setPhysician(phy);
		Affiliatedwith obj = affiliatedwithRepository.save(object);	
	}

	@Override
	public List<Physician> getPhysiciansByDepartment(Integer departmentId) {
		Department dep = departmentRepository.findById(departmentId).get();
		List<Affiliatedwith> affiliations = affiliatedwithRepository.findByDepartment(dep);
		List<Physician> physicians= new ArrayList<Physician>();
		for(Affiliatedwith aff:affiliations) {
			physicians.add(aff.getPhysician());
		}
		 return physicians;
		
	}

	@Override
	public List<Department> getDepartmentsByPhysician(Integer physicianId) {
		Physician dep = physicianRepository.findById(physicianId).get();
		List<Affiliatedwith> affiliations = affiliatedwithRepository.findByPhysician(dep);
		List<Department> departments = new ArrayList<Department>();
		for(Affiliatedwith aff:affiliations) {
			departments.add(aff.getDepartment());
		}
		 return departments;
	}

	@Override
	public Integer countPhysiciansByDepartment(Integer departmentId) {
		Department dep = departmentRepository.findById(departmentId).get();
		return affiliatedwithRepository.countByDepartment(dep);
	}

	@Override
	public Department getPrimaryAffiliation(int physicianId) {
		Physician phy = physicianRepository.findById(physicianId).get();
		Affiliatedwith primaryAffiliation = affiliatedwithRepository.findByPhysician(phy);
		if(primaryAffiliation != null) {
		int departmentId=primaryAffiliation.getDepartmentId();
		return departmentRepository.findById(departmentId).orElse(null);
	}
	return null;
}
	@Override
	public void updatePrimaryAffiliation(int physicianId, int departmentId) {
		affiliatedwithRepository.clearPrimaryAffiliation(physicianId);
		Affiliatedwith newPrimaryAffiliation = new Affiliatedwith(physicianId,departmentId,true);
		affiliatedwithRepository.save(newPrimaryAffiliation);
		
	}
	
	

}*/
