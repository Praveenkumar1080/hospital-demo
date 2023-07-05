package com.cg.hms.Service;

import java.util.ArrayList;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import com.cg.hms.Entity.Department;
import com.cg.hms.Entity.Physician;

import com.cg.hms.Entity.Procedures;
import com.cg.hms.Entity.Trainedin;
import com.cg.hms.repository.DepartmentRepository;
import com.cg.hms.repository.PhysicianRepository;
import com.cg.hms.repository.ProcedureRepository;
import com.cg.hms.repository.TrainedinRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService{
	
	private DepartmentRepository departmentRepository ;
	private PhysicianRepository physicianRepository ;
	private TrainedinRepository trainedinRepository ;
	private ProcedureRepository procedureRepository ;
	
	
	
   @Autowired
	public void DepartmentServiceI(DepartmentRepository departmentRepository,PhysicianRepository physicianRepository,TrainedinRepository trainedinRepository,ProcedureRepository procedureRepository) {
		this.departmentRepository=departmentRepository;
		this.physicianRepository=physicianRepository;
		this.trainedinRepository=trainedinRepository;
		this.procedureRepository=procedureRepository;
	
	}

	@Override
	//1
	public Department saveDepartment(Department department) {
		return departmentRepository.save(department);
	}

	@Override
	//2
	public List<Department> getallDepartments() {
		
		return departmentRepository.findAll();
	}

	@Override
	//3
	public Department getDepartmentDetailByDeptId(Integer departmentid) {
		
		return departmentRepository.findById(departmentid).orElseThrow(()-> new RuntimeException("department not found"+departmentid));
	}

	@Override
	//4
	public Physician getHeadOfDepartmentDetails(Integer depid) {
		Department dep = departmentRepository.findById(depid).get();
		return dep.getHead();
	}

	@Override
	  public List<Trainedin> getHeadCertificationDetailByDeptId(Integer departmentid)
	  { 
	  Department department=departmentRepository.findById(departmentid).orElseThrow(()-> new
	  RuntimeException("department not found"+departmentid)); 
	  Physician phy = department.getHead();
	  List<Trainedin> certifications=trainedinRepository.findByPhysician(phy);
	  return certifications; 
	  }
	@Override
	//6
	public List<Department> getDepartmentByHeadId(Integer head) {
		Physician phy = physicianRepository.findById(head).get();
		return departmentRepository.findByHead(phy);
	}

	@Override
	//7
	public Boolean PhysicianIsHeadOfAnyDepartmentOrNot(Integer physicianid) {
		Boolean ishead = true;
		List<Department> list = getDepartmentByHeadId(physicianid);
		if(list.isEmpty()) {
			ishead = false;
		}
		return ishead;

		
	}

	@Override
	//8
	public Department updateDepartmentHeadId(Department dep, Integer departmentid) {
		Department department=departmentRepository.findById(departmentid).orElseThrow(()->new RuntimeException("department not found"));
		department.setHead(dep.getHead());
		return departmentRepository.save(department);
		
	}

	@Override
	//9
	public Department updateNameOfDepartment(Integer departmentid,Department dep) {
		Department department=departmentRepository.findById(departmentid).orElseThrow(()->new RuntimeException("department not found"));
		department.setName(dep.getName());
		return departmentRepository.save(department);
		
		
	}

	

}
