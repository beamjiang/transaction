package com.beam.transaction;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.beam.transaction.dao.model.CheckBill;
import com.beam.transaction.exception.DataBaseException;
import com.beam.transaction.service.PayCheckBillService;

public class TransactionTest extends BaseTest {
	@Resource(name="payCheckBillService")
	private  PayCheckBillService payCheckBillService;
	
	@Test
	public void testPropagation(){
		try {
			insertPayCheckBill();
			addxKitty();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error("add kitty failed!");
		}
	}
	
	@Transactional(rollbackFor=Exception.class)
	public int addxKitty() throws Exception{
		//DataSourceTypeManager.set(DataSourceType.SLAVE);
		logger.debug("to add task_tmp");
		int ret = this.kittyService.addx("task_tmp1");
		logger.debug("add task_tmp1,ret:"+ret);
		
		throw new DataBaseException();
	}
	
	
	public void insertPayCheckBill(){
		CheckBill bill = new CheckBill();
		bill.setBillDate("20170414");
		bill.setCheckStatus(1);
		this.payCheckBillService.insert(bill);
	}
	

}
