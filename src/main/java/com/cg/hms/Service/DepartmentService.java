package com.cg.hms.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.hms.Entity.Department;
import com.cg.hms.Entity.Physician;

@Service
public interface DepartmentService {

	public Department saveDepartment(String name,Physician head);
	public List<Department> getallDepartments(Integer departmentid);
	public Department getDepartmentDetailByDeptId(Integer departmentid);
	public Physician getHeadOfDepartmentDetails(Integer head);
	public List<String> getHeadCertificationDetailByDeptId(Integer departmentid);
	public List<Department> getDepartmentByHeadId(Integer head);
	public Boolean PhysicianIsHeadOfAnyDepartmentOrNot(Integer physicianid);
	public void updateDepartmentHeadId(Physician head,Integer departmentid);
	public void updateNameOfDepartment(Integer departmentid ,String newName);
	
	
}
