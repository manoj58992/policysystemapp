package com.policysystem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.policysystem.dtos.CustomerDTO;
import com.policysystem.dtos.PolicyDTO;
import com.policysystem.entities.CoveredVehicleEntity;
import com.policysystem.entities.CustomerEntity;
import com.policysystem.entities.PolicyEntity;
import com.policysystem.repositories.CustomerRepository;
import com.policysystem.repositories.PolicyRepository;

@Service
public class PolicyService {

	@Autowired
	private PolicyRepository policyRepository;

	public void createPolicy(PolicyDTO policyDto) {
		PolicyEntity policyEntity = new PolicyEntity();
		policyEntity.setNumber(policyDto.getNumber());
		policyEntity.setType(policyDto.getType());
		policyEntity.setStartdate(policyDto.getStartdate());
		policyEntity.setEnddate(policyEntity.getEnddate());
		policyEntity.setPrice(policyDto.getPrice());

		policyRepository.save(policyEntity);
	}

	/*
	 * private PolicyEntity convert(PolicyDTO policyDto) { PolicyEntity policy =
	 * null; if (policyDto != null) { policy = new PolicyEntity();
	 * policy.setNumber(policyDto.getNumber()); policy.setType(policyDto.getType());
	 * policy.setStartdate(policyDto.getStartdate());
	 * policy.setEnddate(policyDto.getEnddate());
	 * policy.setPrice(policyDto.getPrice());
	 * 
	 * } return policy;
	 */
}
