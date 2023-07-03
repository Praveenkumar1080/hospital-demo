package com.cg.hms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.hms.Entity.Stay;

@Repository
public interface StayRepository extends JpaRepository<Stay, Integer>{

}
