/**
 * 
 */
package com.beam.transaction.util;

import com.beam.transaction.enums.DataSourceType;

/**
 * @author Administrator
 *
 */
public class DataSourceTypeManager {
	private static final ThreadLocal<DataSourceType> dataSourceTypes = new ThreadLocal<DataSourceType>(){
			@Override
			protected DataSourceType initialValue(){
			return DataSourceType.MASTER;
		}
	};
	
	public static DataSourceType get(){
		return dataSourceTypes.get();
	}

	public static void set(DataSourceType dst){
		dataSourceTypes.set(dst);
	}
	
	public static void reset(){
		dataSourceTypes.set(DataSourceType.MASTER);
	}
}
