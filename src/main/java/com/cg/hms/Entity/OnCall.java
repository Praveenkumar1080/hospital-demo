package com.cg.hms.Entity;

import javax.persistence.Column;
import javax.persistence.Id;

public class OnCall {
@Id
private int nurse;
@Column
private int blockfloor;
@Column
private String oncallstart;
@Column
private String oncallend;
public int getNurse() {
	return nurse;
}
public void setNurse(int nurse) {
	this.nurse = nurse;
}
public int getBlockfloor() {
	return blockfloor;
}
public void setBlockfloor(int blockfloor) {
	this.blockfloor = blockfloor;
}
public String getOncallstart() {
	return oncallstart;
}
public void setOncallstart(String oncallstart) {
	this.oncallstart = oncallstart;
}
public String getOncallend() {
	return oncallend;
}
public void setOncallend(String oncallend) {
	this.oncallend = oncallend;
}
@Override
public String toString() {
	return "On_call [nurse=" + nurse + ", blockfloor=" + blockfloor + ", oncallstart=" + oncallstart + ", oncallend="
			+ oncallend + "]";
}
public OnCall() {
	super();
	// TODO Auto-generated constructor stub
}

}
