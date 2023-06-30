package com.cg.hms.Entity;

import javax.persistence.Id;

public class nurse {
	
	
	@Id
	private int employeeid;
    private String name;
    private String position;
    private boolean registered;
    private int ssn;

}
