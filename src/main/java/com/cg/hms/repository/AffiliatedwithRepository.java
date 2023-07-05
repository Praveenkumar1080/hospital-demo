package com.cg.hms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.hms.Entity.AffId;
import com.cg.hms.Entity.Affiliatedwith;
import com.cg.hms.Entity.Department;
import com.cg.hms.Entity.Physician;

@Repository
public interface AffiliatedwithRepository extends JpaRepository<Affiliatedwith,AffId> {
public List<Affiliatedwith> findByDepartment(Department dep);
public List<Affiliatedwith> findByPhysician(Physician dep);
public Integer countByDepartment(Department dep);
}
