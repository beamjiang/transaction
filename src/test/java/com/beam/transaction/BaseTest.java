package com.beam.transaction;
/**
 * 
 */


import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.beam.transaction.service.KittyService;




/**
 * @author Administrator
 *
 *单元测试基类
 *加载context配置
 */
@ContextConfiguration(locations = {"file:src/main/resources/META-INF/spring/application_dev.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class BaseTest {
	protected static final Logger logger = LoggerFactory.getLogger(BaseTest.class);
	
	@Resource(name="kittyService")
	protected  KittyService kittyService;
	
	@Test
	public void baseTest(){
		logger.debug("to test base");
		
	}
	
	
}
