/**
 * 
 */
package com.beam.transaction.service;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.beam.transaction.BaseTest;
import com.beam.transaction.TestKittyService;
import com.beam.transaction.dao.model.CheckBill;
import com.beam.transaction.enums.DataSourceType;
import com.beam.transaction.exception.DataBaseException;
import com.beam.transaction.util.DataSourceTypeManager;

/**
 * @author Administrator
 *
 */
@SuppressWarnings("restriction")
@Service("testService")
public class TestService {
	protected static final Logger logger = LoggerFactory.getLogger(TestService.class);
	
	@Resource(name="kittyService")
	private  KittyService kittyService;
	
	@Resource(name="payCheckBillService")
	private  PayCheckBillService payCheckBillService;
	
	@Transactional(rollbackFor=Exception.class)  
	public void test() throws Exception{
		addPayCheckBill();
		//addKitty();
	}
	
	
	public int addKitty() throws Exception{
		DataSourceTypeManager.set(DataSourceType.SLAVE);
		logger.debug("to add task_tmp");
		int ret = this.kittyService.addx("task_tmp1");
		logger.debug("add task_tmp1,ret:"+ret);
		logger.debug("to add task_tmp2,ret:"+ret);
		int ret2 = this.kittyService.addx("task_tmp2");
		logger.debug("add task_tmp2,ret:"+ret2);
		
		throw new DataBaseException();
	}
	
	
	public void addPayCheckBill(){
		CheckBill bill = new CheckBill();
		bill.setBillDate("20170414");
		bill.setCheckStatus(1);
		this.payCheckBillService.insert(bill);
	}
	

}
