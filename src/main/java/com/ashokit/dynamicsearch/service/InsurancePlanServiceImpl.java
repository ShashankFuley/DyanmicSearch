package com.ashokit.dynamicsearch.service;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.stereotype.Service;

import com.ashokit.dynamicsearch.entity.InsurancePlan;
import com.ashokit.dynamicsearch.repository.InsurancePlanCustomRepositoryImpl;


@Service
public class InsurancePlanServiceImpl implements IInsurancePlanService{

	
	private InsurancePlanCustomRepositoryImpl insuranceRepository;
	
	
	public InsurancePlanServiceImpl(InsurancePlanCustomRepositoryImpl insuranceRepository) {
		this.insuranceRepository = insuranceRepository;
	}
	
	Logger logger = Logger.getLogger(InsurancePlanServiceImpl.class);

	@Override
	public List<InsurancePlan> findAllInsurancePlan(final String planName , final String planStatus) {
		logger.info("**** findAllInsurancePlan() - Executed");
		return this.insuranceRepository.findAllInsurancePlans(planName , planStatus);
	}

	
}
