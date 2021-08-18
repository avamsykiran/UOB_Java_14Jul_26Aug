package com.cts.bta.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.cts.bta.exception.BTAException;
import com.cts.bta.model.Transaction;

public class FileBasedTransactionDaoImpl implements TransactionDao {

	public static final String DATA_FILE_NAME = "./txns.data";
	
	private Map<Long,Transaction> txnMap;
	
	public FileBasedTransactionDaoImpl() throws BTAException {
		readData();
	}
	
	private void readData() throws BTAException {
		File file = new File(DATA_FILE_NAME);
		if(file.exists()) {
			try(ObjectInputStream fin = new ObjectInputStream(new FileInputStream(file))){
				this.txnMap = (Map<Long, Transaction>) fin.readObject();
			} catch (IOException | ClassNotFoundException e) {
				//log the exception e
				throw new BTAException("Could not load data");
			}
		}else {
			this.txnMap = new TreeMap<Long, Transaction>();
		}
	}
	
	private void writeData() throws BTAException {
		File file = new File(DATA_FILE_NAME);
		try(ObjectOutputStream fout = new ObjectOutputStream(new FileOutputStream(file))){
			fout.writeObject(this.txnMap);
		} catch (IOException e) {
			//log the exception e
			throw new BTAException("Could not save data");
		}
	}
	
	@Override
	public List<Transaction> getAll() throws BTAException {
		return new ArrayList<>(txnMap.values());
	}

	@Override
	public Transaction getById(long txnId) throws BTAException {
		return txnMap.get(txnId);
	}

	@Override
	public Transaction add(Transaction txn) throws BTAException {
		long txnId = txnMap.size()+1;
		txn.setTxnId(txnId);
		txnMap.put(txnId,txn);
		writeData();
		return txn;
	}

	@Override
	public void deleteById(long txnId) throws BTAException {
		txnMap.remove(txnId);
		writeData();
	}

}
