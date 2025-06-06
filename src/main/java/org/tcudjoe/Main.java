package org.tcudjoe;

import org.tcudjoe.weas.practice.model.Transaction;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.tcudjoe.weas.practice.service.FraudDetector.findLimitViolators;


public class Main {
	public static void main(String[] args) {
		List<Transaction> transactionList = Arrays.asList(
				new Transaction("custId1", LocalDate.of(2025, 5, 29), 12.99),
				new Transaction("custId2", LocalDate.of(2025, 5, 29), 8.49),
				new Transaction("custI1", LocalDate.of(2025, 5, 29), 13),
				new Transaction("custId3", LocalDate.of(2025, 5, 29), 150),
				new Transaction("custId5", LocalDate.of(2025, 5, 29), 65),
				new Transaction("custId12", LocalDate.of(2025, 5, 29), 250),
				new Transaction("custId5", LocalDate.of(2025, 5, 29), 99.99),
				new Transaction("custId5", LocalDate.of(2025, 5, 29), 3.45),
				new Transaction("custId5", LocalDate.of(2025, 5, 29), 2),
				new Transaction("custId6", LocalDate.of(2025, 5, 29), 0.79),
				new Transaction("custId2", LocalDate.of(2025, 5, 29), 80.99),
				new Transaction("custId3", LocalDate.of(2025, 5, 29), 30),
				new Transaction("custId4", LocalDate.of(2025, 5, 29), 30),
				new Transaction("custId2", LocalDate.of(2025, 5, 29), 30),
				new Transaction("custId3", LocalDate.of(2025, 5, 29), 17),
				new Transaction("custId5", LocalDate.of(2025, 5, 29), 154),
				new Transaction("custId4", LocalDate.of(2025, 5, 29), 294),
				new Transaction("custId6", LocalDate.of(2025, 5, 29), 80),
				new Transaction("custId8", LocalDate.of(2025, 5, 29), 450),
				new Transaction("custId4", LocalDate.of(2025, 5, 29), 80),
				new Transaction("custId3", LocalDate.of(2025, 5, 29), 46),
				new Transaction("custId1", LocalDate.of(2025, 5, 29), 300),
				new Transaction("custId5", LocalDate.of(2025, 5, 29), 250),
				new Transaction("custId2", LocalDate.of(2025, 5, 29), 7),
				new Transaction("custId3", LocalDate.of(2025, 5, 29), 90),
				new Transaction("custId1", LocalDate.of(2025, 5, 29), 30)
		);

		List<String> result = findLimitViolators(transactionList);
		System.out.println("Violators: " + result);
	}
}