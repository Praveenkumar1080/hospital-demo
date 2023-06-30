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
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Prescribes {

	private Integer physician;
	private Integer patient;
	private Integer medication;
	private String data;
	private Integer appointment;
	
}
