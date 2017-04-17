/**
 * 
 */
package com.beam.transaction.launcher;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.beam.transaction.exception.NormalException;
import com.beam.transaction.service.TestService;

/**
 * @author Administrator
 *
 */
public class Launcher {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/application_dev.xml");
		TestService testService = (TestService) context.getBean("testService");
		try {
			//testService.test();
			testService.getPayCheckBill();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
