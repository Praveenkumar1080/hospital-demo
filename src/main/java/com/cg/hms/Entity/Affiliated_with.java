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

public class Affiliated_with {


	private Integer physician;
	private Integer department;
	private Boolean primaryaffiliation;
	
}
