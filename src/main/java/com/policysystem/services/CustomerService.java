package com.policysystem.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.policysystem.dtos.CustomerDTO;
import com.policysystem.entities.CustomerEntity;
import com.policysystem.repositories.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	public void createCustomer(CustomerDTO customerDto) {
		CustomerEntity customerEntity = new CustomerEntity();
		customerEntity.setName(customerDto.getName());
		customerEntity.setEmail(customerDto.getEmail());
		customerEntity.setGender(customerDto.getGender());
		customerEntity.setPhone(customerDto.getPhone());
		customerEntity.setDob(customerDto.getDob());
		customerEntity.setLastssn(customerDto.getLastssn());

		customerRepository.save(customerEntity);
	}

	public CustomerDTO getCustomerById(Long id) {
		CustomerEntity customerEntity = customerRepository.findById(id);
		return convert(customerEntity);
//		CustomerDTO customer = null;
//		if(customerEntity != null) {
//			customer = new CustomerDTO();
//			customer.setName(customerEntity.getName());
//			customer.setEmail(customerEntity.getEmail());
//			customer.setGender(customerEntity.getGender());
//			customer.setGender(customerEntity.getGender());
//  		customer.setPhone(customerEntity.getPhone());
//		    customer.setDob(customerEntity.getDob());
//			customer.setLastssn(customerEntity.getLastssn());		
//		}
//		return customer;
	}

	public List<CustomerDTO> searchCustomersByName(String name) {
		List<CustomerDTO> customerDtoList = new ArrayList<CustomerDTO>();
		List<CustomerEntity> customers = customerRepository.findByName(name);
		if (!customers.isEmpty()) {
			for (CustomerEntity c : customers) {
				CustomerDTO cdto = convert(c);
				customerDtoList.add(cdto);
			}
		}
		return customerDtoList;
	}

	private CustomerDTO convert(CustomerEntity customerEntity) {
		CustomerDTO cdto = null;
		if (customerEntity != null) {
			cdto = new CustomerDTO();
			cdto.setName(customerEntity.getName());
			cdto.setEmail(customerEntity.getEmail());
			cdto.setGender(customerEntity.getGender());
			cdto.setPhone(customerEntity.getPhone());
			cdto.setDob(customerEntity.getDob());
			cdto.setLastssn(customerEntity.getLastssn());
		}
		return cdto;
	}

	public CustomerRepository getCustomerRepository() {
		return customerRepository;
	}

	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

}
