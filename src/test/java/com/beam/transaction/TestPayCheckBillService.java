package com.beam.transaction;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.beam.transaction.dao.model.CheckBill;
import com.beam.transaction.service.PayCheckBillService;

public class TestPayCheckBillService extends BaseTest {
	@Resource(name="payCheckBillService")
	private  PayCheckBillService payCheckBillService;
	
	@Test
	@Transactional(isolation=Isolation.READ_COMMITTED,rollbackFor=Exception.class) 
	public void addPayCheckBill() throws Exception{
		CheckBill bill = new CheckBill();
		bill.setBillDate("20170415");
		bill.setCheckStatus(1);
		System.out.println("to addPayCheckBill:"+bill);
		int ret = this.payCheckBillService.insert(bill);
		System.out.println("addPayCheckBill,ret:"+ret);
		throw new Exception();
	}

}
