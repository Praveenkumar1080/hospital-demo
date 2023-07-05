package com.cg.hms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.hms.Entity.Block;
import com.cg.hms.Entity.BlockId;

@Repository
public interface BlockRepository extends JpaRepository<Block, BlockId>{

}
