package com.cg.hms.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CollectionId;

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
public class Trainedin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int physician;
	@Column
    private int treatment;
	@Column
    private String certificationdate;
	@Column
    private String certificationexpires;

}
