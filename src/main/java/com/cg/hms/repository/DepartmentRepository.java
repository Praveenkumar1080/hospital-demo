package com.cg.hms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.hms.Entity.Department;
import com.cg.hms.Entity.Physician;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

	public List<Department> findByHead(Physician physician);
}
