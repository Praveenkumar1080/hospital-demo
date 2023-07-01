package com.cg.hms.Entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Physician {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Integer employeeid;
@Column(name="name")
private String name;
@Column
private String position;
@Column
private Integer ssn;
public Integer getEmployeeid() {
	return employeeid;
}
public void setEmployeeid(Integer employeeid) {
	this.employeeid = employeeid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPosition() {
	return position;
}
public void setPosition(String position) {
	this.position = position;
}
public Integer getSsn() {
	return ssn;
}
public void setSsn(Integer ssn) {
	this.ssn = ssn;
}
@Override
public String toString() {
	return "Physician [employeeid=" + employeeid + ", name=" + name + ", position=" + position + ", ssn=" + ssn + "]";
}
public Physician() {
	super();
	// TODO Auto-generated constructor stub
}

}
