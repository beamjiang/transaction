/**
 * 
 */
package com.beam.transaction.util;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.beam.transaction.enums.DataSourceType;

/**
 * @author Administrator
 *
 */
@Aspect
@Component 
@Order(0) 
public class DataSourceInterceptor {
	
	@Pointcut("execution(public * com.beam.transaction.service.KittyService..*.add(..))")
	public void dataSourceSlave(){
		System.out.println("to dataSourceSlave");
	};
	@Before("dataSourceSlave()")
	public void before(JoinPoint jp) {
		System.out.println("to before");
	DataSourceTypeManager.set(DataSourceType.SLAVE);
	}

}
