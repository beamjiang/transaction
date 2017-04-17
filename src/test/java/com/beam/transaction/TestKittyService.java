package com.beam.transaction;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.beam.transaction.service.KittyService;

@SuppressWarnings("restriction")
@Service("testKittyService")
public class TestKittyService  extends BaseTest{
	@Resource(name="kittyService")
	private  KittyService kittyService;

	@Transactional(propagation=Propagation.NESTED,isolation=Isolation.READ_COMMITTED,rollbackFor=Exception.class) 
	public void addKitty() throws Exception{
		System.out.println("enter addKitty!");
		int ret = this.kittyService.add("hello,kitty");
		System.out.println("add kitty,ret:"+ret);
		throw new Exception();
	}
}
