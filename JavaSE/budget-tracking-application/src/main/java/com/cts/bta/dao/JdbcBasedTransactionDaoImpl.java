package com.cts.bta.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.cts.bta.exception.BTAException;
import com.cts.bta.model.Transaction;
import com.cts.bta.model.TransactionType;

public class JdbcBasedTransactionDaoImpl implements TransactionDao{
	
	public static final String PROP_FILE_NAME="./resources/application.properties";
	
	public static final String GET_ALL_QRY = "SELECT * FROM txns";
	public static final String GET_By_ID_QRY = "SELECT * FROM txns WHERE txnId=?";
	public static final String INS_QRY = "INSERT INTO txns(header,amount,type,txnDate) VALUES(?,?,?,?)";
	public static final String DEL_By_ID_QRY = "DELETE FROM txns WHERE txnId=?";
	
	private String dbUrl;
	private String dbUid;
	private String dbPwd;
	
	public JdbcBasedTransactionDaoImpl() throws BTAException {
		Properties props = new Properties();
		try {
			props.load(new FileInputStream(PROP_FILE_NAME));
			
			dbUrl = props.getProperty("db.url");
			dbUid = props.getProperty("db.uid");
			dbPwd = props.getProperty("db.pwd");
		} catch (IOException e) {
			throw new BTAException("Operation Failed Root Cause " +e.getMessage());
		}
	}
	
	private Connection getConnection() throws SQLException {
		return DriverManager.getConnection(dbUrl,dbUid,dbPwd);
	}
	
	private Transaction mapRow(ResultSet rs) throws SQLException {
		Transaction txn = new Transaction();
		txn.setTxnId(rs.getLong(1));
		txn.setHeader(rs.getString(2));
		txn.setAmount(rs.getDouble(3));
		txn.setType(TransactionType.valueOf(rs.getString(4)));
		txn.setTxnDate(rs.getDate(5).toLocalDate());
		return txn;
	}
	
	@Override
	public List<Transaction> getAll() throws BTAException {
		List<Transaction> txns = new ArrayList<Transaction>();
		
		try(
				Connection con = getConnection();
				PreparedStatement pst = con.prepareStatement(GET_ALL_QRY)){
			
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				txns.add(mapRow(rs));
			}
		} catch (SQLException e) {
			throw new BTAException("Operation Failed! Root Cause:-"+e.getMessage());
		}
		
		return txns;
	}

	@Override
	public Transaction getById(long txnId) throws BTAException {
		Transaction txn = null;
		try(
				Connection con = getConnection();
				PreparedStatement pst = con.prepareStatement(GET_By_ID_QRY)){
			
			pst.setLong(1, txnId);
			ResultSet rs = pst.executeQuery();
			
			if(rs.next()) {
				txn =mapRow(rs);
			}
		} catch (SQLException e) {
			throw new BTAException("Operation Failed! Root Cause:-"+e.getMessage());
		}
		
		return txn;
	}

	@Override
	public Transaction add(Transaction txn) throws BTAException {
		if(txn!=null) {
			try(
					Connection con = getConnection();
					PreparedStatement pst = con.prepareStatement(INS_QRY);
				){
				
				pst.setString(1, txn.getHeader());
				pst.setDouble(2, txn.getAmount());
				pst.setString(3, txn.getType().name());
				pst.setDate(4, Date.valueOf(txn.getTxnDate()));
				
				pst.executeUpdate();
			} catch (SQLException e) {
				throw new BTAException("Operation Failed! Root Cause:-"+e.getMessage());
			}
		}
		return txn;
	}

	@Override
	public void deleteById(long txnId) throws BTAException {
		try(
				Connection con = getConnection();
				PreparedStatement pst = con.prepareStatement(DEL_By_ID_QRY)){
			
			pst.setLong(1, txnId);
			pst.executeUpdate();
		} catch (SQLException e) {
			throw new BTAException("Operation Failed! Root Cause:-"+e.getMessage());
		}
		
	}

}
