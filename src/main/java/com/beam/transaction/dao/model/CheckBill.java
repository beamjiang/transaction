package com.beam.transaction.dao.model;

public class CheckBill {
	
	private String billDate;
	private Integer checkStatus;
	public String getBillDate() {
		return billDate;
	}
	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}
	public Integer getCheckStatus() {
		return checkStatus;
	}
	public void setCheckStatus(Integer checkStatus) {
		this.checkStatus = checkStatus;
	}
	@Override
	public String toString() {
		return "CheckBill [billDate=" + billDate + ", checkStatus=" + checkStatus + "]";
	}
	
	
	
}
