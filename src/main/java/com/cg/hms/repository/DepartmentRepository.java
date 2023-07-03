package com.cg.hms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.hms.Entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

	Boolean existsByHead(Integer physicianid);

	List<Department> findbyHead(Integer head);

	void setName(String name);

	void setHead(Integer head);

	

	int getHead();

}
