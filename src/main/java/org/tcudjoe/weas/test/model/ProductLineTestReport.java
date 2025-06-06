package org.tcudjoe.weas.test.model;

public class ProductLineTestReport {
	long correctCounter;      // number of correct products
	long checkedExcCounter;   // number of products which threw a checked exception during verification
	long uncheckedExcCounter; // number of products which threw an unchecked exception during verification
	long otherExcCounter;     // number of products which threw an error during verification

	public ProductLineTestReport(long correctCounter, long checkedExcCounter, long uncheckedExcCounter, long otherExcCounter) {
		this.correctCounter = correctCounter;
		this.checkedExcCounter = checkedExcCounter;
		this.uncheckedExcCounter = uncheckedExcCounter;
		this.otherExcCounter = otherExcCounter;
	}
}
