package com.cts.bta.dao;

import java.util.List;

import com.cts.bta.exception.BTAException;
import com.cts.bta.model.Transaction;

public interface TransactionDao {
	
	List<Transaction> getAll() throws BTAException;
	Transaction getById(long txnId)  throws BTAException;
	Transaction add(Transaction txn)  throws BTAException;
	void deleteById(long txnId)  throws BTAException;

}
