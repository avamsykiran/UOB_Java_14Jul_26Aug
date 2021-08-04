package com.cts.ed.service;

import com.cts.ed.exception.InsufficientBalanceExcepton;
import com.cts.ed.exception.InvalidDepositeAmountException;
import com.cts.ed.exception.InvalidWithdrawAmountException;
import com.cts.ed.model.BankAccount;

public class BankingService {
	
	public static final double MIN_BAL=500;
	
	public void deposite(BankAccount acc,double amount) throws InvalidDepositeAmountException {
		if(amount<0)
			throw new InvalidDepositeAmountException("Amount "+amount+" received to deposite is not a positive number");
		acc.setBalance(acc.getBalance()+amount);
	}
	
	public void withdraw(BankAccount acc,double amount) throws InvalidWithdrawAmountException, InsufficientBalanceExcepton {
		if(amount<0)
			throw new InvalidWithdrawAmountException("Amount "+amount+" received to deposite is not a positive number");
		
		if((acc.getBalance()-amount)<MIN_BAL)
			throw new InsufficientBalanceExcepton("Insuffient Balance "+acc.getBalance());
		
		acc.setBalance(acc.getBalance()-amount);
	}

}
