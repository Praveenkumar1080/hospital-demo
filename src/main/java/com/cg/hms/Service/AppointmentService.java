package com.cg.hms.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.hms.Entity.Appointment;

@Service
public interface AppointmentService {
	
	public Appointment saveAppointment(Appointment appointment);
	public List<Appointment> getallAppointments(Integer appointmentid);
	public List<Appointment> getallAppointmentsByStartDate(String start_dt_time);
	public Appointment getPatientInfoByAppointmentId(Integer patient,Integer appointementid);
	

}
