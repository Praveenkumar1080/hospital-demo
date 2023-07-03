package com.cg.hms.Entity;

import javax.persistence.Column;
import javax.persistence.Id;

public class Nurse {
	
	
	@Id
	private int employeeid;
	@Column
    private String name;
	@Column
    private String position;
	@Column
    private boolean registered;
	@Column
    private int ssn;

}
