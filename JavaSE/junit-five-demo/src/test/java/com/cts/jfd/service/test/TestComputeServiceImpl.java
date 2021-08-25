package com.cts.jfd.service.test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.cts.jfd.exception.InvalidDivisorException;
import com.cts.jfd.service.ComputeServiceImpl;

public class TestComputeServiceImpl {
	
	ComputeServiceImpl cs;
	
	public TestComputeServiceImpl () {
		cs = new ComputeServiceImpl();
	}
	
	@Test
	@DisplayName("sum should return additive result")
	void testSum() {
		assertAll(
				() -> assertEquals(0, cs.sum(0, 0)),
				() -> assertEquals(-2, cs.sum(-1, -1)),
				() -> assertEquals(2, cs.sum(1, 1)),
				() -> assertEquals(0, cs.sum(-1, 1))
		);
	}
	
	@Test
	@DisplayName("qut should return arithmetic division result")
	void testQut() {
		assertAll(
				() -> assertEquals(2, cs.qut(10,5)),
				() -> assertEquals(-2, cs.qut(-10, 5)),
				() -> assertEquals(2, cs.qut(-10, -5)),
				() -> assertThrows(InvalidDivisorException.class, ()->{cs.qut(10, 0);})
		);
	}
}
