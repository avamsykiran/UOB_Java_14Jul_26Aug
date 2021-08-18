package com.cts.bta.ui;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.cts.bta.exception.BTAException;
import com.cts.bta.model.Transaction;
import com.cts.bta.model.TransactionType;
import com.cts.bta.service.TransactionService;
import com.cts.bta.service.TransactionServiceImpl;

public class TransactionUI {
	
	private TransactionService txnService;
	private Scanner kbin;
	
	public void run() {
		try {
			this.kbin = new Scanner(System.in);
			this.txnService=new TransactionServiceImpl();
			
			String choices = Arrays.stream(Menu.values()).
					map(c->c.name()).
					reduce((c1,c2)-> c1+","+c2).orElse("");
			
			Menu choice=null;
			
			while(choice!=Menu.QUIT) {
				System.out.println(String.format("Pick One [%s]> ",choices));
				String chStr = kbin.next().toUpperCase();
				
				if(choices.indexOf(chStr)==-1) {
					System.out.println("Invalid choice");
					continue; //skip the current iteration
				}
				
				choice = Menu.valueOf(chStr);
				
				switch(choice) {
				case ADD: doAdd(); break;
				case DELETE: doDelete(); break;
				case LIST: doList(); break;
				case QUIT:	System.out.println("Application Terminated");break;
				}
			}
		} catch (BTAException e) {
			System.out.println(e.getMessage());
		}
	}

	public void doAdd() {
		Transaction txn = new Transaction();
		
		System.out.print("Header> ");
		txn.setHeader(kbin.next());
		System.out.print("Amount> ");
		txn.setAmount(kbin.nextDouble());
		System.out.print("Tyep (INCOME/EXPENCE)> ");
		txn.setType(TransactionType.valueOf(kbin.next().toUpperCase()));
		
		try {
			txnService.add(txn);
			System.out.println("Transaction Recorded Successfully");
		} catch (BTAException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public void doDelete() {
		System.out.print("Transaction Id> ");
		long txnId = kbin.nextLong();
		try {
			txnService.deleteById(txnId);
			System.out.println("Transaction Removed Successfully");
		} catch (BTAException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void doList() {
		
		try {
			List<Transaction> txns = txnService.getAll();
			
			txns.stream().
				map(t -> String.format(
						"%d\t%s\t%s\t%s\t%.2f",t.getTxnId(),
						t.getTxnDate(),t.getHeader(),
						t.getType(),t.getAmount())).
				forEach(System.out::println);
			
			System.out.println("Total Income: "+txnService.getTotalIncome());
			System.out.println("Total Expenses: "+txnService.getTotalExpenses());
			System.out.println("Balance: "+txnService.getBalance());
			
		} catch (BTAException e) {
			System.out.println(e.getMessage());
		}
	}
}
