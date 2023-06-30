package com.cg.hms.Entity;

public class On_call {
private int nurse;
private int blockfloor;
private String oncallstart;
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
public On_call() {
	super();
	// TODO Auto-generated constructor stub
}

}
