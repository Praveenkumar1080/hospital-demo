package com.cg.hms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.hms.Entity.Procedure;

@Repository
public interface ProcedureRepository extends JpaRepository<Procedure, Integer>{
	

}
