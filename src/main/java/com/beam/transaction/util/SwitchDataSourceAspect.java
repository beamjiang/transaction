/**
 * 
 */
package com.beam.transaction.util;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.core.annotation.Order;

import com.beam.transaction.enums.DataSourceType;

/**
 * @author Administrator
 *
 */
@Order(0)
public class SwitchDataSourceAspect {
	
	 public void doAfter(JoinPoint jp) {  
	        System.out.println("log Ending method: "  
	                + jp.getTarget().getClass().getName() + "."  
	                + jp.getSignature().getName());  
	    }  
	  
	    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {  
	        long time = System.currentTimeMillis();  
	        Object retVal = pjp.proceed();  
	        time = System.currentTimeMillis() - time;  
	        System.out.println("process time: " + time + " ms");  
	        return retVal;  
	    }  
	  
	    public void doBefore(JoinPoint jp) {  
	        System.out.println("log Begining method: "  
	                + jp.getTarget().getClass().getName() + "."  
	                + jp.getSignature().getName());  
	        DataSourceTypeManager.set(DataSourceType.SLAVE);
	    }  
	  
	    public void doThrowing(JoinPoint jp, Throwable ex) {  
	        System.out.println("method " + jp.getTarget().getClass().getName()  
	                + "." + jp.getSignature().getName() + " throw exception");  
	        System.out.println(ex.getMessage());  
	    }  

}
