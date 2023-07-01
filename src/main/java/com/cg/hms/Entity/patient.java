package com.cg.hms.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

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
    @Id
	private Integer ssn;
    @Column
	private String name;
    @Column
	private String address;
    @Column
	private Integer phone;
    @Column
	private Integer insuranceid;
    @Column 
	private Integer pcp;
	
	
}
