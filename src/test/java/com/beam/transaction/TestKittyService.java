package com.beam.transaction;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.beam.transaction.enums.DataSourceType;
import com.beam.transaction.service.KittyService;
import com.beam.transaction.util.DataSourceTypeManager;

@SuppressWarnings("restriction")
@Service("testKittyService")
public class TestKittyService  extends BaseTest{
	@Resource(name="kittyService")
	private  KittyService kittyService;

	//
	@Test
	@Transactional(isolation=Isolation.READ_COMMITTED,rollbackFor=Exception.class) 
	public void addKitty() throws Exception{
		DataSourceTypeManager.set(DataSourceType.SLAVE);
		System.out.println("enter addKitty!");
		int ret = this.kittyService.add("hello,kitty");
		System.out.println("add kitty,ret:"+ret);
		throw new Exception();
	}
}
