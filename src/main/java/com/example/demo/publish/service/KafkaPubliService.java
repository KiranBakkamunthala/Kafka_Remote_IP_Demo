package com.example.demo.publish.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.publish.constant.KafkaPublishConstant;
import com.example.demo.publish.entiry.Customer;

@Service("customerService")
public class KafkaPubliService {

	@Autowired
	private KafkaTemplate<String, Customer> kafkaTemplate;

	public String add(Customer customer) {
		kafkaTemplate.send(KafkaPublishConstant.TOPIC, customer);
		return "customer record added to kakfka queue successfuly";
	}

	@KafkaListener(topics = KafkaPublishConstant.TOPIC, groupId = KafkaPublishConstant.GROUP_ID)
	public Customer listner(Customer c) {
		System.out.println("Message received from kafka tafic::"+c);
		return c;
	}
}
