package com.demo.tdd.services;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EchoServiceImplTest {

	private EchoService echoService = new EchoServiceImpl();

	@Test
	void testEcho() {
		assertEquals("abc", echoService.echo("abc"));
	}
}