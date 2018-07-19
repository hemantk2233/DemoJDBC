package com.capgemini.paymentwallet.bean;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class AccountDetails {

	private float custBal;
	private int custAccNo;
	private LocalDate custAccDate;
	private CustomerDetails customerDetails;
	private List<String> transaction = new ArrayList<String>();
	
	public float getCustBal() {
		return custBal;
	}

	public void setCustBal(float custBal) {
		this.custBal = custBal;
	}

	public int getCustAccNo() {
		return custAccNo;
	}

	public void setCustAccNo(int custAccNo) {
		this.custAccNo = custAccNo;
	}

	public LocalDate getCustAccDate() {
		return custAccDate;
	}

	public void setCustAccDate(LocalDate custAccDate) {
		this.custAccDate = custAccDate;
	}

	public CustomerDetails getCustomerDetails() {
		return customerDetails;
	}

	public void setCustomerDetails(CustomerDetails customerDetails) {
		this.customerDetails = customerDetails;
	}

	

	public List<String> getTransaction() {
		return transaction;
	}

	public void setTransaction(List<String> transaction) {
		this.transaction = transaction;
	}

	
	

}
