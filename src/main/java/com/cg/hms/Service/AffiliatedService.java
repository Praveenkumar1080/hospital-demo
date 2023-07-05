package com.cg.hms.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.hms.Entity.Affiliatedwith;
import com.cg.hms.Entity.Department;
import com.cg.hms.Entity.Physician;

@Service
public interface AffiliatedService {

	public void saveAffiliatedwith();
	public List<Physician> getPhysiciansByDepartment(Integer departmentId);
	public List<Department> getDepartmentsByPhysician(Integer physicianId);
	public Integer countPhysiciansByDepartment(Integer departmentId);
	public Department getPrimaryAffiliation(Integer physicianId);
	public void updatePrimaryAffiliation(int physicianId,int departmentId);
	
	
	
	
	
}
