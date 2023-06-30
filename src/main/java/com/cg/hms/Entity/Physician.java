package com.cg.hms.Entity;

public class Physician {
private Integer employeeid;
private String name;
private String position;
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
