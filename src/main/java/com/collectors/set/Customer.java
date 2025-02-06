package com.collectors.set;

import java.util.Objects;

/**
 * @author NaveenWodeyar
 *
 */

public class Customer {

	 private String custName;
	 
	 private Integer custId;
	 
	 public Customer() {}
	 

	/**
	 * @param custName
	 * @param custId
	 */
	public Customer(String custName, Integer custId) {
		super();
		this.custName = custName;
		this.custId = custId;
	}


	@Override
	public int hashCode() {
		return Objects.hash(custId, custName);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(custId, other.custId) && Objects.equals(custName, other.custName);
	}


	/**
	 * @return the custName
	 */
	public String getCustName() {
		return custName;
	}

	/**
	 * @param custName the custName to set
	 */
	public void setCustName(String custName) {
		this.custName = custName;
	}

	/**
	 * @return the custId
	 */
	public Integer getCustId() {
		return custId;
	}

	/**
	 * @param custId the custId to set
	 */
	public void setCustId(Integer custId) {
		this.custId = custId;
	}
	 
	 
}
