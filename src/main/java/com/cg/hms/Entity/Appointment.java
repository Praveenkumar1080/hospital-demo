package com.cg.hms.Entity;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Appointment {

	private Integer appointmentid;
	private Integer patient;
	private Integer prepnums;
	private Integer physician;
	private String start_dt_time;
	private String end_dt_time;
	private String examinationroom;
	}
