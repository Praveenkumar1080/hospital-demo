package com.cg.hms.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import com.cg.hms.Entity.Department;
import com.cg.hms.Entity.Physician;
import com.cg.hms.Entity.Procedure;
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
	public void DepartmentService(DepartmentRepository departmentRepository,PhysicianRepository physicianRepository,TrainedinRepository trainedinRepository,ProcedureRepository procedureRepository) {
		this.departmentRepository=departmentRepository;
		this.physicianRepository=physicianRepository;
		this.trainedinRepository=trainedinRepository;
		this.procedureRepository=procedureRepository;
	
	}

	@Override
	public Department saveDepartment(String name, Integer head) {
		Department department=new Department();
		departmentRepository.setName(name);
		departmentRepository.setHead(head);
		return departmentRepository.save(department);
	}

	@Override
	public List<Department> getallDepartments(Integer departmentid) {
		
		return departmentRepository.findAll();
	}

	@Override
	public Department getDepartmentDetailByDeptId(Integer departmentid) {
		
		return departmentRepository.findById(departmentid).orElseThrow(()-> new RuntimeException("department not found"+departmentid));;
	}

	@Override
	public Physician getHeadOfDepartmentDetails(Integer head) {
		Department department=departmentRepository.findById(departmentid).orElseThrow(()-> new RuntimeException("department not found"+departmentid));
		int headEmployeeId=departmentRepository.getHead();
		
		
		
		return physicianRepository.findById(headEmployeeId).orElseThrow(()->new RuntimeException("Department head not found"+headEmployeeId));;
	}

	@Override
	public List<String> getHeadCertificationDetailByDeptId(Integer departmentid) {
		Department department=departmentRepository.findById(departmentid).orElseThrow(()-> new RuntimeException("department not found"+departmentid));
		int headEmployeeId=departmentRepository.getHead();
		
		Physician head=physicianRepository.findById(headEmployeeId).orElseThrow(()->new RuntimeException("Department head not found"+headEmployeeId));
		
		List<Trainedin> certifications=trainedinRepository.findByPhysician(head);
		List<String> certificationNames=new ArrayList<>();
		for(Trainedin certification : certifications) {
			int treatmentCode=certification.gettreatment();
			Procedure procedure=procedureRepository.findByCode(treatmentCode);
			certificationNames.add(procedure.getName());
			
		}
		return certificationNames;
	}

	@Override
	public List<Department> getDepartmentByHeadId(Integer head) {
		
		return departmentRepository.findbyHead(head);
	}

	@Override
	public Boolean PhysicianIsHeadOfAnyDepartmentOrNot(Integer physicianid) {
		
		return departmentRepository.existsByHead(physicianid);
	}

	@Override
	public void updateDepartmentHeadId(Integer head, Integer departmentid) {
		Department department=departmentRepository.findById(departmentid).orElseThrow(()->new NotFoundException("department not found"));
		departmentRepository.setHead(head);
		departmentRepository.save(department);
		
	}

	@Override
	public void updateNameOfDepartment(Integer departmentid, String newName) {
		Department department=departmentRepository.findById(departmentid).orElseThrow(()->new NotFoundException("department not found"));
		departmentRepository.setName(newName);
		departmentRepository.save(department);
		
		
	}

	

}
