package com.beam.transaction;

import java.util.ArrayList;

import org.junit.Test;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.beam.transaction.exception.DataBaseException;

public class TransactionTest extends BaseTest {
	
	@Test
	public void testPropagation(){
		try {
			addKitty();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error("add kitty failed!");
		}
	}
	
	//@Transactional(rollbackForClassName="DataBaseException",isolation=Isolation.READ_COMMITTED)
	public int addKitty() throws Exception{
		logger.debug("to add task_tmp");
		int ret = this.kittyService.add("task_tmp1");
		
		logger.debug("to add task_tmp2,ret:"+ret);
		int ret2 = this.kittyService.add("task_tmp2");
		logger.debug("add task_tmp2,ret:"+ret2);
		
		throw new DataBaseException();
	}
	
	

}
