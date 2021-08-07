package com.javaproject.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaproject.springboot.model.ServiceProvider;
import com.javaproject.springboot.repository.ServiceProviderRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/")
public class ServiceProviderController {
	@Autowired
	private ServiceProviderRepository serviceProviderRepository;
	
	@GetMapping("serviceproviders")
	public List<ServiceProvider> getServiceProviders(){
		return this.serviceProviderRepository.findAll();
	}
}
