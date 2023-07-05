package com.cg.hms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;


import com.cg.hms.Entity.Procedures;

@Repository
public interface ProcedureRepository extends JpaRepository<Procedures, Integer>{
public List<Procedures> findByName(String name);
}
