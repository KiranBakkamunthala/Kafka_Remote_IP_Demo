package com.example.demo.publish.entiry;

import java.io.Serializable;

public class Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String customerId;
	private String customerFName;
	private String CustomerLName;

	public Customer() {
		//super();
	}

	public Customer(String customerId, String customerFName, String customerLName) {
		//super();
		this.customerId = customerId;
		this.customerFName = customerFName;
		CustomerLName = customerLName;
	}

	
	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerFName() {
		return customerFName;
	}

	public void setCustomerFName(String customerFName) {
		this.customerFName = customerFName;
	}

	public String getCustomerLName() {
		return CustomerLName;
	}

	public void setCustomerLName(String customerLName) {
		CustomerLName = customerLName;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerFName=" + customerFName + ", CustomerLName="
				+ CustomerLName + "]";
	}

}
