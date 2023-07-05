package com.cg.hms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.hms.Entity.Physician;
import com.cg.hms.Entity.TrainedId;
import com.cg.hms.Entity.Trainedin;


@Repository
public interface TrainedinRepository extends JpaRepository<Trainedin, TrainedId>{

	List<Trainedin> findByPhysician(Physician head);
	
	

}
