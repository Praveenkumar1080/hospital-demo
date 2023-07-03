package com.cg.hms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;


import com.cg.hms.Entity.Procedures;

@Repository
public interface ProcedureRepository extends JpaRepository<Procedures, Integer>{

	Procedures findByCode(Procedures treatmentCode);
	

}
