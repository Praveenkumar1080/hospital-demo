package com.cg.hms.Entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
 private Integer departmentid;
	@Column
 private String name;
	@Column
 private Integer head;

 
}
