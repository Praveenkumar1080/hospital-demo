package com.cg.hms.Entity;

import javax.persistence.Column;
import javax.persistence.Id;

public class Undergoes {
@Id
private Integer patient;
@Column
private Integer procedure;
@Column
private Integer stay;
@Column
private String date;
@Column
private Integer physician;
@Column
private Integer assistingnurse;
public Integer getPatient() {
	return patient;
}
public void setPatient(Integer patient) {
	this.patient = patient;
}
public Integer getProcedure() {
	return procedure;
}
public void setProcedure(Integer procedure) {
	this.procedure = procedure;
}
public Integer getStay() {
	return stay;
}
public void setStay(Integer stay) {
	this.stay = stay;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public Integer getPhysician() {
	return physician;
}
public void setPhysician(Integer physician) {
	this.physician = physician;
}
public Integer getAssistingnurse() {
	return assistingnurse;
}
public void setAssistingnurse(Integer assistingnurse) {
	this.assistingnurse = assistingnurse;
}
@Override
public String toString() {
	return "Undergoes [patient=" + patient + ", procedure=" + procedure + ", stay=" + stay + ", date=" + date
			+ ", physician=" + physician + ", assistingnurse=" + assistingnurse + "]";
}
public Undergoes() {
	super();
	// TODO Auto-generated constructor stub
}

}
