package com.cg.hms.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.hms.Entity.Department;
import com.cg.hms.Entity.Physician;

@Service
public interface DepartmentService {

	public Department saveDepartment(Department department);
	public List<Department> getallDepartments(Integer departmentid);
	public Department getDepartmentDetailByDeptId(Integer departmentid);
	public Department getHeadOfDepartmentDetails(Integer head);
	public List<Department> getHeadCertificationDetailByDeptId(Integer departmentid);
	public List<Department> getDepartmentByHeadId(Integer head);
	public Boolean PhysicianIsHeadOfAnyDepartmentOrNot(Integer physicianid);
	public Department updateDepartmentHeadId(Integer head,Integer departmentid ,Physician physician);
	public Department updateNameOfDepartment(String name,Integer departmentid ,Physician physician);
	
	
}
