package com.cg.hms.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.hms.Entity.Nurse;

@Service
public interface NurseService {
	
	public Nurse saveNurse(Nurse nurse);
	public List<Nurse> getallNurses(Integer employeeid);
	public Nurse getDetailOfNurseByemployeeId(Integer employeeid);
	public Nurse getPositionOfNurseByemployeeId(String position);
	public Boolean NurseIsRegisteredOrNot(Boolean registered);
	public Nurse updateValueOfregistred(Integer employeeid, Nurse nurse);
	public Nurse updateValueOfSSN(Integer ssn, Nurse nurse);
	

}
