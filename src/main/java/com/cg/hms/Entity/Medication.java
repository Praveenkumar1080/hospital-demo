package com.cg.hms.Entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Medication {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private Integer code;
	@Column
private String name;
	@Column
private String brand;
	@Column
private String description;

}
