/**
 * 
 */
package com.beam.transaction.dao;

import com.beam.transaction.dao.model.KittyDO;
import com.beam.transaction.exception.DataBaseException;

/**
 * @author Administrator
 *
 */
public interface KittyDao {
	 int add(KittyDO obj) throws DataBaseException;
	
	 KittyDO getById(Integer id);
 
}
