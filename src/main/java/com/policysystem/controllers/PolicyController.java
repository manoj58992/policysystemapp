package com.policysystem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.policysystem.dtos.PolicyDTO;
import com.policysystem.services.PolicyService;

@RestController
@RequestMapping(value = "/policy")
public class PolicyController {

	@Autowired
	private PolicyService policyService;

	@RequestMapping(value = "", method = RequestMethod.POST)
	public void createPolicy(@RequestBody PolicyDTO policyDto, @RequestParam Long policyId) {
		policyService.createPolicy(policyDto);
	}

	/*
	 * @RequestMapping(value = "/coveredvehicle", method = RequestMethod.POST)
	 * public void addCoveredVehicleToPolicy(@RequestBody PolicyDTO policyDto) {
	 * policyService.addCoveredVehicleToPolicy(policyDto); }
	 * 
	 * @RequestMapping(value = "/covereddriver", method = RequestMethod.POST) public
	 * void addDriverToPolicy(@RequestBody PolicyDTO policyDto) {
	 * policyService.addDriverToPolicy(policyDto);
	 */

}
