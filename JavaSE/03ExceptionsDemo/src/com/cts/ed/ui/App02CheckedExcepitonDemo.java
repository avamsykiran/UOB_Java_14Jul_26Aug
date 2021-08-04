package com.cts.ed.ui;

import java.util.Scanner;

import com.cts.ed.exception.InsufficientBalanceExcepton;
import com.cts.ed.exception.InvalidDepositeAmountException;
import com.cts.ed.exception.InvalidWithdrawAmountException;
import com.cts.ed.model.BankAccount;
import com.cts.ed.service.BankingService;

public class App02CheckedExcepitonDemo {

	private static Scanner scan; 
	
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);

		BankingService bankingService = new BankingService();
		BankAccount acc = new BankAccount("120021001", 4500.0);
		
		double amount=0;
		int choice=0;
		
		while(choice!=4) {
			System.out.println("Choice[1-Know Balance,2-Deposite,3-Withdraw,4-Exit]> ");
			choice = readInt();
			
			switch(choice) {
			case 1:
				System.out.println(acc.getBalance());
				break;
			case 2:
				System.out.println("Amount> ");
				amount = readDouble();
				try {
					bankingService.deposite(acc, amount);
					System.out.println("Deposited Successfully");
				} catch (InvalidDepositeAmountException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				System.out.println("Amount> ");
				amount = readDouble();
				try {
					bankingService.withdraw(acc, amount);
					System.out.println("Withdrawn Successfully");
				} catch (InvalidWithdrawAmountException e) {
					System.out.println(e.getMessage());
				} catch (InsufficientBalanceExcepton e) {
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				System.out.println("Ok! Bye!");
				break;
			default:
				System.out.println("Unknown choice");
			}
		}
		
	}

	public static double readDouble() {
		while(!scan.hasNextDouble())
			System.out.println("please enter a decimal value");
		return scan.nextDouble();
	}
	
	public static int readInt() {
		while(!scan.hasNextInt())
			System.out.println("please enter a non-decimal number");
		return scan.nextInt();
	}
}
