package com.cts.bta.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.cts.bta.dao.FileBasedTransactionDaoImpl;
import com.cts.bta.dao.TransactionDao;
import com.cts.bta.exception.BTAException;
import com.cts.bta.model.Transaction;
import com.cts.bta.model.TransactionType;

public class TransactionServiceImpl implements TransactionService {
	
	private TransactionDao txnDao;
	
	public TransactionServiceImpl() throws BTAException {
		this.txnDao=new FileBasedTransactionDaoImpl();
	}

	@Override
	public List<Transaction> getAll() throws BTAException {
		return txnDao.getAll();
	}

	@Override
	public Transaction getById(long txnId) throws BTAException {
		return txnDao.getById(txnId);
	}

	@Override
	public Transaction add(Transaction txn) throws BTAException {
		List<String> errMsgs = new ArrayList<>();
		
		if(txn.getHeader()==null || txn.getHeader().isEmpty())
			errMsgs.add("Transaction Header is a mandate feild");
		if(txn.getAmount()==null || txn.getAmount()<=0)
			errMsgs.add("Transaction Amount is a mandate positive decimal value");
		if(txn.getType()==null)
			errMsgs.add("Transaction Type is a manditory field");
		
		if(!errMsgs.isEmpty())
			throw new BTAException(errMsgs.toString());

		txn.setTxnDate(LocalDate.now());
		
		return txnDao.add(txn);
	}

	@Override
	public void deleteById(long txnId) throws BTAException {
		txnDao.deleteById(txnId);
	}

	@Override
	public double getTotalIncome() throws BTAException {
		return getAll().stream().
				filter(t -> t.getType()==TransactionType.INCOME).
				map(t -> t.getAmount()).
				reduce((a1,a2)->a1+a2).orElse(0.0);
	}

	@Override
	public double getTotalExpenses() throws BTAException {
		return getAll().stream().
				filter(t -> t.getType()==TransactionType.EXPENCE).
				map(t -> t.getAmount()).
				reduce((a1,a2)->a1+a2).orElse(0.0);
	}

	@Override
	public double getBalance() throws BTAException {
		return getTotalIncome()-getTotalExpenses();
	}

}
