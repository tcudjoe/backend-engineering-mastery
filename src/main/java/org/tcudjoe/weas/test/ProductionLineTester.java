package org.tcudjoe.weas.test;

import org.tcudjoe.weas.test.interfaces.ProductVerifier;
import org.tcudjoe.weas.test.model.Product;
import org.tcudjoe.weas.test.model.ProductLineTestReport;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProductionLineTester {
	private final ProductVerifier verifier;
	private Product product;
	private ProductLineTestReport testReport;

	ProductionLineTester(ProductVerifier verifier) {
		this.verifier = verifier;
	}

	ProductLineTestReport test(Stream<Product> products) {
		long correct = 0;
		long checked = 0;
		long unchecked = 0;
		long other = 0;

		if (products == null) {
			return new ProductLineTestReport(0, 0, 0, 0);
		}

		List<Product> filteredProducts = products
				.filter(Objects::nonNull)
				.filter(product -> !"invalid".equalsIgnoreCase(product.getStatus()))
				.skip(10)
				.limit(20)
				.collect(Collectors.toList());

		for (Product product : filteredProducts) {
			try {
				verifier.verify(product);
				correct++;
			} catch (RuntimeException re) {
				unchecked++;
			} catch (Exception e) {
				checked++;
			} catch (Error er) {
				other++;
			}
		}


		return new ProductLineTestReport(correct, checked, unchecked, other);
	}
}
