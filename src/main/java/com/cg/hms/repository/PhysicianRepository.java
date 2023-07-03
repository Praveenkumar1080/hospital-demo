package com.cg.hms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.hms.Entity.Physician;

@Repository
public interface PhysicianRepository extends JpaRepository<Physician, Integer> {

}
