package com.ashokit.dynamicsearch.repository;

import java.util.List;

import com.ashokit.dynamicsearch.entity.InsurancePlan;

public interface InsurancePlanCustomRepository {
	
	List<InsurancePlan> findAllInsurancePlans(String planName , String planStaus);
}
