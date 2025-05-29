package org.tcudjoe.weasPractice.model;

import java.time.LocalDate;

public class Transaction {
	public String customerId;
	public LocalDate date;
	public double amount;

	public Transaction(String customerId, LocalDate date, double amount) {
		this.customerId = customerId;
		this.date = date;
		this.amount = amount;
	}
}
