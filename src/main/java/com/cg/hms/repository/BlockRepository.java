package com.cg.hms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.hms.Entity.Block;

@Repository
public interface BlockRepository extends JpaRepository<Block, Integer>{

}
