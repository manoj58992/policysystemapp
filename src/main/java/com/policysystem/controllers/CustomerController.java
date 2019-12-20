package com.policysystem.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.policysystem.dtos.CustomerDTO;
import com.policysystem.services.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {

	public class ArtistController {

		@Autowired
		private CustomerService customerService;

		@RequestMapping(value = "", method = RequestMethod.POST)
		public void createCustomer(@RequestBody CustomerDTO customerDto) {
			customerService.createCustomer(customerDto);
		}

		@RequestMapping(value = "", method = RequestMethod.GET)
		public CustomerDTO getCustomerById(@RequestParam(value = "id", required = true) Long customerId) {
			return customerService.getCustomerById(customerId);
		}

		@RequestMapping(value = "/name", method = RequestMethod.GET)
		public List<CustomerDTO> getCustomerByName(@RequestParam(value = "name", required = true) String name) {
			return customerService.searchCustomersByName(name);
		}
	}
}
