package com.beam.transaction.dao;

import com.beam.transaction.dao.model.CheckBill;

public interface PayCheckBillDao {

	CheckBill getByDate(String billDate);
	
	int add(CheckBill bill);
}
