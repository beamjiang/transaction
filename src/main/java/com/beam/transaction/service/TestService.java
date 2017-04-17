/**
 * 
 */
package com.beam.transaction.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.beam.transaction.TestKittyService;
import com.beam.transaction.dao.model.CheckBill;
import com.beam.transaction.dao.model.PayChannelTypeDO;
import com.beam.transaction.exception.DataBaseException;
import com.beam.transaction.exception.NormalException;

/**
 * @author Administrator
 *
 */
@SuppressWarnings("restriction")
@Service("testService")
public class TestService {
	
	@Resource(name="kittyService")
	private  KittyService kittyService;
	
	@Resource(name="testKittyService")
	private  TestKittyService testKittyService;
	
	@Resource(name="payCheckBillService")
	private  PayCheckBillService payCheckBillService;
	
	@Transactional(rollbackFor=Exception.class)  
	public void test() throws Exception{
		
	}
	
	
	public void getPayCheckBill(){
		String billDate = "2017-02-14";
		CheckBill bill = this.payCheckBillService.getByWhere(billDate);
		System.out.println("bill:"+bill);
	}

}
