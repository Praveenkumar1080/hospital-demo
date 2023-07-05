package com.cg.hms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.hms.Entity.Physician;

@Repository
public interface PhysicianRepository extends JpaRepository<Physician, Integer> {

	

	Physician findByName(String name);

	List<Physician> findByPosition(String position);

}
