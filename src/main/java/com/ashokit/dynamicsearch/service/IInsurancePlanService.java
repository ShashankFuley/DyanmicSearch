package com.ashokit.dynamicsearch.service;

import java.util.List;

import com.ashokit.dynamicsearch.entity.InsurancePlan;

public interface IInsurancePlanService {
	
	List<InsurancePlan> findAllInsurancePlan(String planName , String planStatus);
}
