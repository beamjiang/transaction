package com.beam.transaction;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.beam.transaction.dao.model.CheckBill;
import com.beam.transaction.exception.DataBaseException;
import com.beam.transaction.service.PayCheckBillService;

public class TransactionTest extends BaseTest {
	@Resource(name="payCheckBillService")
	private  PayCheckBillService payCheckBillService;
	
	@Test
	@Transactional(isolation=Isolation.READ_COMMITTED,rollbackFor=Exception.class) 
	public void testPropagation(){
		logger.debug("enter testPropagation");
		try {
			insertPayCheckBill();
			addxKitty();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error("add kitty failed!");
		}
	}
	
	public int addxKitty() throws Exception{
		//DataSourceTypeManager.set(DataSourceType.SLAVE);
		logger.debug("to add task_tmp");
		int ret = this.kittyService.addx("task_tmp1");
		logger.debug("add task_tmp1,ret:"+ret);
		
		throw new Exception();
	}
	
	
	public void insertPayCheckBill(){
		
		CheckBill bill = new CheckBill();
		bill.setBillDate("20170414");
		bill.setCheckStatus(1);
		logger.debug("to insert checkBill:"+bill);
		int ret  = this.payCheckBillService.insert(bill);
		logger.debug("ret of insert checkBill:"+ret);
	}
	

}
