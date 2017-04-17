package com.beam.transaction.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.beam.transaction.dao.PayCheckBillDao;
import com.beam.transaction.dao.model.CheckBill;

@SuppressWarnings("restriction")
@Service("payCheckBillService")
public class PayCheckBillService {
	@SuppressWarnings("restriction")
	@Resource
	private PayCheckBillDao dao; 
	public CheckBill getByWhere(String billDate){
		return this.dao.getByDate(billDate);
	}
	
	public int insert(CheckBill bill){
		return this.dao.add(bill);
	}

}
