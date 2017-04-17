/**
 * 
 */
package com.beam.transaction.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.beam.transaction.dao.KittyDao;
import com.beam.transaction.dao.model.KittyDO;

/**
 * @author Administrator
 *
 */
@SuppressWarnings("restriction")
@Service("kittyService")
public class KittyService {
	
	@Resource
	private KittyDao kDao;
	public int addx(String name){
		KittyDO obj = new KittyDO();
		obj.setName(name);
		return this.kDao.add(obj);
	}

}
