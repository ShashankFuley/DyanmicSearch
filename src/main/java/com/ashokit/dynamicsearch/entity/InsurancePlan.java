package com.ashokit.dynamicsearch.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="INSURANCE_PLANS")
public class InsurancePlan {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="PLAN_ID" , length = 10)
	private Long id;
	
	@Column(name="PLAN_NAME" , length = 20 , nullable = false)
	private String planName;
	
	@Column(name="PLAN_STATUS" ,length = 20 , nullable = false)
	private String planStatus;
	
	@Column(name="HOLDER_NAME" , length = 20 , nullable = false)
	private String holderName;
	
	@Column(name = "HOLDER_SSN" ,length = 10 , nullable = false)
	private String holderSsn;
	
	
	public InsurancePlan() {
	}

}
