package com.cts.bta.service;

import java.util.List;

import com.cts.bta.exception.BTAException;
import com.cts.bta.model.Transaction;

public interface TransactionService {

	List<Transaction> getAll() throws BTAException;
	Transaction getById(long txnId)  throws BTAException;
	Transaction add(Transaction txn)  throws BTAException;
	void deleteById(long txnId)  throws BTAException;

	double getTotalIncome() throws BTAException;
	double getTotalExpenses() throws BTAException;
	double getBalance()throws BTAException;
	
}
