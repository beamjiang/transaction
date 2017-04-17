/**
 * 
 */
package com.beam.transaction.service;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import com.beam.transaction.util.DataSourceTypeManager;

/**
 * @author Administrator
 *
 */
public class RoutingDataSorceService extends AbstractRoutingDataSource {

	/* (non-Javadoc)
	 * @see org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource#determineCurrentLookupKey()
	 */
	@Override
	protected Object determineCurrentLookupKey() {
		// TODO Auto-generated method stub
		return DataSourceTypeManager.get();
	}

}
