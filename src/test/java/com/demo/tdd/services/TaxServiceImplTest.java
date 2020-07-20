package com.demo.tdd.services;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TaxServiceImplTest {

	private TaxService taxService = new TaxServiceImpl();
	@Test
	void test0() {
		assertEquals(0, taxService.getIncomeTax(0));
	}
}