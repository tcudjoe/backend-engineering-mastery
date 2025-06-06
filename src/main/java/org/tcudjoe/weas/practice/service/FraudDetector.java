package org.tcudjoe.weas.practice.service;

import org.tcudjoe.weas.practice.model.CustomerDataKey;
import org.tcudjoe.weas.practice.model.Transaction;

import java.util.*;

/**
 * Assignment:
 *
 * I am given a list of transactions. Each transaction contains:
 * - a customer ID (String)
 * - a transaction date (LocalDate)
 * - an amount (double)
 *
 * My task is to detect *fraudulent* customers who have exceeded a daily transaction amount limit.
 *
 * Business Rule:
 * A customer is considered a violator if the total sum of their transactions
 * for a single day exceeds 250 euros.
 *
 * Goal:
 * Implement a method that returns a list of customer IDs who violated this rule.
 * The list should only contain each violator once, even if they violated on multiple days.
 *
 * Signature:
 * public static List<String> findLimitViolators(List<Transaction> transactions)
 */

public class FraudDetector {


	public static List<String> findLimitViolators(List<Transaction> transactions) {
		Map<CustomerDataKey, Double> totalsByCustomerAndDate = new HashMap<>();

		for (Transaction i : transactions) {
			CustomerDataKey key = new CustomerDataKey(i.customerId, i.date);
			totalsByCustomerAndDate.put(key, totalsByCustomerAndDate.getOrDefault(key, 0.0) + i.amount);
		}

		Set<String> violators = new HashSet<>();

		for (Map.Entry<CustomerDataKey, Double> entry : totalsByCustomerAndDate.entrySet()) {
			if (entry.getValue() > 500.0) {
				violators.add(entry.getKey().customerId());
			}
		}

		return new ArrayList<>(violators);
	}
}
