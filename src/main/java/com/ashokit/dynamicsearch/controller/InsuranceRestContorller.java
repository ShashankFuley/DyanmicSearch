package com.ashokit.dynamicsearch.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.dynamicsearch.entity.InsurancePlan;
import com.ashokit.dynamicsearch.entity.RequestBindingEntity;
import com.ashokit.dynamicsearch.service.InsurancePlanServiceImpl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/insurance")
@Api(value = "Insuranc Plan Rest API")
public class InsuranceRestContorller {

	private InsurancePlanServiceImpl insurancePlanService;
	
	public InsuranceRestContorller(InsurancePlanServiceImpl insurancePlanService) {
		this.insurancePlanService = insurancePlanService;
	}
	
	@ApiOperation(value = "To get all insurane plan")
	@PostMapping("/getAll")
	public ResponseEntity<List<InsurancePlan>> getAllInsurancePlan(@RequestBody final RequestBindingEntity requestEntity){
		return ResponseEntity.ok(this.insurancePlanService.findAllInsurancePlan(requestEntity.getPlanName() , requestEntity.getPlanStatus()));
	}
	
}
