package com.cg.hms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;


import com.cg.hms.Entity.Oncall;

@Repository
public interface OnCallRepository extends JpaRepository<Oncall, Integer>{

}
