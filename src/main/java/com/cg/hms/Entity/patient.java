package com.cg.hms.Entity;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class patient {

	private Integer ssn;
	private String name;
	private String address;
	private Integer phone;
	private Integer insuranceid;
	private Integer pcp;
	
	
}
