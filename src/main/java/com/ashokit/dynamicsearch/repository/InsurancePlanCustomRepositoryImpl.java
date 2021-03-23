package com.ashokit.dynamicsearch.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.ashokit.dynamicsearch.entity.InsurancePlan;

@Repository
public class InsurancePlanCustomRepositoryImpl implements InsurancePlanCustomRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	public InsurancePlanCustomRepositoryImpl() {
	}

	@Override
	public List<InsurancePlan> findAllInsurancePlans(final String planName , final String planStatus) {
		
		
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<InsurancePlan> query = cb.createQuery(InsurancePlan.class); 
		Root<InsurancePlan> insurancePlan = query.from(InsurancePlan.class);
		
		Path<String> planNamePath = insurancePlan.get("planName");
		Path<String> planStatusPath = insurancePlan.get("planStatus");
		
		List<Predicate> predicates = new ArrayList<>();
		
		if(planName != null)  predicates.add(cb.like(planNamePath, planName));
		
		if(planStatus != null) predicates.add(cb.like(planStatusPath, planStatus));
		
		query.select(insurancePlan).where(cb.and(predicates.toArray(new Predicate[predicates.size()])));
		
		return entityManager.createQuery(query).getResultList();
	}

}
