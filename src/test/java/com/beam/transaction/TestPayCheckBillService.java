package com.beam.transaction;

import javax.annotation.Resource;

import org.junit.Test;

import com.beam.transaction.dao.model.CheckBill;
import com.beam.transaction.service.PayCheckBillService;

public class TestPayCheckBillService extends BaseTest {
	@Resource(name="payCheckBillService")
	private  PayCheckBillService payCheckBillService;
	
	@Test
	public void addPayCheckBill(){
		CheckBill bill = new CheckBill();
		bill.setBillDate("20170415");
		bill.setCheckStatus(1);
		this.payCheckBillService.add(bill);
	}

}
