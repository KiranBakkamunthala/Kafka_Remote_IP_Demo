package com.example.demo.publish.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.publish.entiry.Customer;
import com.example.demo.publish.service.KafkaPubliService;

@RestController
public class KafkaPubliController {
	
	@Autowired
	private KafkaPubliService kafkaPubliService;
	
	@PostMapping("/custinfo")
	public String addCustomer(@RequestBody Customer customer) {
		return kafkaPubliService.add(customer);
	}

}
