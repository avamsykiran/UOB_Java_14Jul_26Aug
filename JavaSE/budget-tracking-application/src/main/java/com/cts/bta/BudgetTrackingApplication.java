package com.cts.bta;

import com.cts.bta.ui.TransactionUI;

public class BudgetTrackingApplication {

	public static void main(String[] args) {
		System.out.println("Budget Tracking Application");
		System.out.println("============================");
		new TransactionUI().run();
		System.out.println("Application Closed");
	}

}
